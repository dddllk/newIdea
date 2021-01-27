package day17.linkedlist;

public class Link {
	// 头节点
	Node header;

	int size = 0;

	public int size() {
		return size;
	}

	// 向链表中添加元素(向链表末尾添加元素)
	public void add(Object obj) {
		// 创建一个新的节点对象
		// 让之前单向链表的末尾节点next指向新节点对象。
		// 有可能这个元素是第一个，也可能是第二个
		if(header == null) {
			// 说明还没有头结点
			// new一个新的节点对象，作为头节点对象。
			// 这个时候的头节点即是一个头节点，也是一个末尾节点
			header = new Node(obj, null);
		}else {
			// 说明头不是空
			// 头节点已经存在了
			// 找出当前末尾节点，让当前末尾节点的next节点是新结点
			Node currentLastNode = findLast(header);
			currentLastNode.next = new Node(obj, null);
		}
		size++;
	}

	private Node findLast(Node node) {
		if(node.next == null) {
			// 说明一个节点的next是null
			// 说明这个节点就是末尾节点
			return node;
		}else {
			// 程序如果能够执行到这里说明：node不是末尾节点
			return findLast(node.next); // 递归算法
		}
	}

	// 修改链表中某个数据的方法
	public void modify(Object data) {

	}
	// 删除链表中某个数据的方法
	public void remove(Object obj) {

	}
	// 查找链表中某个数据的方法
	public Boolean find(Object data) {
		// Node中没有节点
		if(header == null) {
			return null;
		}else {
		    
		}
		// 程序执行到这里说明Node只有一个节点
		return data == findLast(header).element;
	}
}
