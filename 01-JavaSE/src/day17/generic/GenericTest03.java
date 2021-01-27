package day17.generic;
/*
	自定义泛型：
		自定义泛型的时候，<>尖括号中的是标识符，随便写
		java源代码中进场出现的是<E>（Element）和<T>（Type），不用泛型就是Object类型
 */
public class GenericTest03<标识符随便写> {
	public void doSome(标识符随便写 o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// new对象的时候指定了泛型是String类型
		GenericTest03<Integer> gt = new GenericTest03<>();
		gt.doSome(123);

		// T是什么类型，返回的就是什么类型
		MyIterator<String> m1 = new MyIterator<>();
		String s1 = m1.get();

		MyIterator<Animal> m2 = new MyIterator<>();
		Animal a = m2.get();
	}
}

class MyIterator<T> {
	public T get(){
		return null;
	} 
}
