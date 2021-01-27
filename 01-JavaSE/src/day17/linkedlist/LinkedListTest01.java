package day17.linkedlist;
/*
链表的优点：
	由于链表上的元素在空间上存储的内存地址不连续。
	所以随机增删元素的时候不会有大量的元素位移，因此随机增删效率比较高
	在以后开发的过程中，如果遇到随机增删集合元素的业务比较多是，建议使用LinkedList

链表的缺点：
	不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头节点开始遍历，直到找到为止。
	所以LinkedList集合检索、查找效率比较低。

ArrayList：把检索发挥到极致。（末尾添加元素效率还是很高的）
LinkedList：把随机增删发挥到极致
加元素都是往末尾添加，所以ArrayList用的比LinkedList多。



	注意：LinkedList集合底层也是有下标的
			 ArrayList之所以效率比较高，不是单纯因为下标的原因。是因为底层数组发挥的作用。
			 LinkedList集合照样有下标，但是检索/查找某个元素效率较低，只能从头结点开始一个一个向下遍历
 */
public class LinkedListTest01 {
}

/*
	LinkedList集合没有初始化容量
	最初这个链表没有任何元素。first和last引用都是null
	不管是LinkedList还是ArrayList，以后写代码时不需要关心具体是哪个集合。
	因为我们要面向接口编程，调用的方法还是接口中的方法
	List list = new ArrayList(); // 这样写表示底层你用了数组
	List list = new LinkedList(); // 这样写表示底层你用了双向链表
 */