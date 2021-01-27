package day17.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	1.jdk5.0之后的新特性：泛型
	2.泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的（运行阶段泛型没有用）
	3.使用泛型的好处：
		集合中存储的元素统一了
		集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”
	4.泛型的缺点：
		导致集合中存储元素缺乏多样性
		大多数业务中，集合中元素存储的元素类型还是统一的。
 */
public class GenericTest01 {
	public static void main(String[] args) {
		// 不使用泛型机制，分析程序的缺点
		/*
		List list = new ArrayList();

		// 创建对象
		Cat c = new Cat();
		Bird b = new Bird();

		// 添加对象到集合中
		list.add(c);
		list.add(b);

		// 遍历集合 取出Cat让它抓老鼠，取出Bird让它飞
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof Cat) {
				c = (Cat)o;
				c.catchMouse();
			}else if(o instanceof Bird) {
				b = (Bird)o;
				b.fly();
			}
		}
	}
	 */
		// 使用JDK5之后的泛型机制
		// 使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
		// 用泛型来指定集合中存储的数据类型
		List<Animal> list = new ArrayList<Animal>();

    // list.add(123); // 不能存储其他类型了，只能存储Animal类型

		// 指定List集合中只能存储Animal,那么存储String就编译报错了。
		// 这样使用泛型之后，集合中的元素更加统一了
		Cat c = new Cat();
		Bird b = new Bird();
		// 添加对象到集合中
		list.add(c);
		list.add(b);
		// 获取迭代器
		// 这个迭代器表示迭代的是Animal类型
		Iterator<Animal> it = list.iterator();
		while(it.hasNext()) {
			// 使用泛型之后，每一次返回的数据都是Animal类型
		  Animal a = it.next();
		  a.move();
		  // 调用子类特有的方法还是要向下类型转换的
		  if(a instanceof Cat) {
		  	Cat c1 = (Cat)a;
		  	c1.catchMouse();
			}else if(a instanceof Bird) {
		  	Bird b1 = (Bird)a;
		  	b1.fly();
			}
		}
	}
}
class Animal {
	public void move() {
		System.out.println("animal move");
	}
}
class Cat extends Animal {
	public void catchMouse() {
		System.out.println("catch mouse");
	}
}
class Bird extends Animal {
  public void fly() {
		System.out.println("bird fly");
	}
}
