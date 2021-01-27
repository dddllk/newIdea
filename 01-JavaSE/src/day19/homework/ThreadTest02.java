package day19.homework;
/*
	使用生产者和消费者模式实现交替输出：
		假设只有两个线程，输出一下结果：
			t1-->1
			t2-->2
			t1-->3
			t2-->4
			t1-->5
			t2-->6
			...
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		// 创建数字对象
		Num num = new Num(0);
		// 创建线程对象
		Thread t1 = new Thread(new Producer(num));
		Thread t2 = new Thread(new Customer(num));
		// 设置线程对象的名字
		t1.setName("t1");
		t2.setName("t2");
		// 启动线程
		t1.start();
		t2.start();
	}
}
// 生产者t1
class Producer implements Runnable {
	// 参数
	Num num;
	// 无参构造方法
	public Producer() {

	}
	// 有参构造方法
	public Producer(Num num) {
		this.num = num;
	}

	@Override
	public void run() {
		// 一直输出奇数
		while(true) {
			// 上锁
			synchronized(num) {
				if(num.getNum() % 2 == 0) { //如果是偶数，则等待
					try {
						num.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// 程序执行到这里说明是奇数
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 输出奇数
				System.out.println(Thread.currentThread().getName() + "-->" + num.getNum());
				// +1变成偶数
				num.setNum(num.getNum() + 1);

				// 唤醒
				num.notify();
			}
		}
	}
}

// 消费者t2
class Customer implements Runnable {
	Num num;
	// 无参构造方法
	public Customer() {

	}
	// 有参构造方法
	public Customer(Num num) {
		this.num = num;
	}
	@Override
	public void run() {
		// 一直输出偶数
		while(true) {
			synchronized(num) {
				if(num.getNum()%2 != 0) { //如果是奇数
					try {
						num.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// 程序执行到这里说明是偶数
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 输出偶数
				System.out.println(Thread.currentThread().getName() + "-->" + num.getNum());
				// +1变成奇数
				num.setNum(num.getNum() + 1);
				// 唤醒
				num.notify();
			}
		}
	}
}
class Num{
	// 参数
	private int num;
	// 无参构造
	public Num(){

	}
	// 有参构造
	public Num(int num) {
		this.num = num;
	}
	// setter and getter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
/*
	过程原理：
	两个线程启动后，都有可能抢到CPU时间片，
	假设打印奇数的线程首先抢到时间片，此时如果数字对象的值为奇数，
	则打印奇数的线程（t1)在控制台中输出，之后数字值变为偶数，t1线程等待，释放锁，
	此时输出偶数的线程(t2)获得锁，在控制台中输出后数字值加一并唤醒在Num对象上等待的线程t1同时释放锁，
	如此循环通过使用wait()和notify()方法的配合来模仿生产者消费者模式，实现一个交替输出。
 */
