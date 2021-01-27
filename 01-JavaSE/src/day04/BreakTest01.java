package day04;
/*
	java控制语句中的break：
		1. break是java语句当中的关键字，被翻译为“中断、折断”；
		2. break + ";"可以成为一个单独的完整的java语句：break;
		3. break语句可以使用在switch语句中，用来终止switch的语句执行。
		4. break语句同样可以使用在循环语句当中，用来终止循环执行。
		5. break终止哪个循环呢？
		6. break;语句使用在for，while，do...while语句当中，用来跳出循环，终止循环的执行。
			 因为当程序到某个条件的时候，后续的循环没有必要执行了，再执行也是耗费资源，所以
			 可以终止循环，这样可以提高程序的执行效率。
 */
public class BreakTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break; // 终止的是当前for循环
			}
			System.out.println("i--->" + i); // 0 1 2 3 4
		}
		// 这里的程序和以上的for循环无关
		System.out.println("hello world");

		for (int j = 0; j < 10; j++) {
	    for (int k = 0; k < 10; k++) {
        if (k == 5) {
          break; // 当前的break语句终止的是内层for循环，因为这个for离他最近。
	               // 这里的break语句不会影响到外层for循环
        }
        System.out.println("i--->" + k);
	    }
		}
	}
}
