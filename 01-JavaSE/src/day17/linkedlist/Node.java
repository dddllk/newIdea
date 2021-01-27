package day17.linkedlist;
/*
	单链表中的节点。
		每一个节点都有两个属性：
			一个属性：是存储的数据
			另一个属性： 下一个节点的内存地址
 */
public class Node {
	// 存储的数据
	Object element;
	// 下一个节点的内存地址
	Node next;

	public Node() {}

	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
}
