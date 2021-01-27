package day15.homework1;
/*
	编写程序，使用一维数组，模拟栈数据结构
	要求：
		1.这个栈可以存储java中的任何引用类型的数据。
		2.在栈中提供push方法模拟压栈（栈满了，要有提示信息）
		3.在栈中提供pop方法模拟弹栈（栈满了，也要有提示信息）
		4.编写测试程序，new栈对象，调用pop、push方法模拟弹栈，压栈的动作
 */
public class MyStack {
	// 提供数组存储栈中的元素
	private Object[] elements;
	private int index;

	// 无参构造方法
	public MyStack() {
		elements = new Object[10];
		index = -1;
	}

	public Object[] getElements() {
		return elements;
	}

	public void setElements(Object[] elements) {
		this.elements = elements;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	// push方法（压栈）
	public void push(Object obj) {
		if(index >= elements.length - 1) {
			System.out.println("栈已满");
			return;
		}
		// 指针+1
		// index++;
		// 插入的obj插入elements数组中
		// elements[index] = obj;
		elements[++index] = obj;
		// 所有System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString()方法
		System.out.println("压栈" + obj + "成功！栈帧指向：" + index);
	}

	// pop方法（弹栈）
	public Object pop() {
		if (index < 0) {
			System.out.println("弹栈失败，栈已空！");
			return null;
		}
		System.out.print("弹栈" + elements[index] + "成功！");
		// 栈帧向下移动一位
		index--;
		System.out.println("栈帧指向：" + index);
		// 返回弹栈元素
		return elements[index + 1];
	}
}

