package day18.hash;

import java.util.HashMap;
import java.util.Map;

/*
	HashMap集合：
		1.HashMap集合底层是哈希表/散列表的数据结构
		2.哈希表的数据结构：
			哈希标是一个数组和单向链表的结合体。
			数组：在查询方面效率很高，随机增删方面效率很低。
			单向链表：在查询方面效率很低，随机增删方面效率很高
		3.HashMap集合底层的代码：
			public class HashMap{
				// HashMap底层实际上就是一个数组（一维数组）
				Node<K, V>[] table;

				// 静态内部类HashMap.Node
				static class Node<K, V> {
					final int hash; // 哈希值（是key和value的HashCode()方法的执行结果。hash通过哈希函数/算法可以转换存储成数组的下标）
					final K key;  //存储到Map集合中的那个key
					V value;   // 存储到Map集合中的那个value
					Node<K, V> next; // 下一个节点的内存地址
				}
			}
		4. map.put(k, v)
			 v = map.get(k)
			 这两个方法的实现原理是必须掌握的
	  5.HashMap集合的key部分特点：
	  	无序，不可重复。
	  	为什么无序？因为不一定挂到哪个单向链表上。
	  	不可重复是怎么保证的？equals方法来保证HashMap集合的key不可重复。如果key重复了value会覆盖

	  	放在HashMap集合key部分的元素其实就是放到HashSet集合中了。
	  	所以HashSet集合中的元素也需要同时重写HashCode() + equals()方法
	  6.哈希表HashMap使用不当时无法发挥性能！
	  	假设将所有的hashCode()方法返回固定的某个值，那么导致哈希表，变成了纯单向链表。
	  	这种情况分为散列分布不均匀
	  	散列分布均匀是指：
	  		假设有100个元素，10个单向链表，那么每一个单向链表上有10个节点是最好的。
	  	将所有的hashCode()方法返回值都不能设定成不一样的值，原因：
	  		这样会导致底层哈希标就称为一维数组了，没有链表概念了，也是散列分布不均匀。

	  	散列分布均匀重写hashCode()方式时有一定的技巧。

	  7.重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法
	  8.HashMap集合的默认初始化容量是16，默认加载因子是0.75
	  	这个默认加载印在是当HashMap集合底层数组容量达到75%的时候，数组开始扩容
	  	HashMap集合初始化容纳必须是2的倍数，这也是官方推荐的
	  	这是因为达到散列均匀。
 */
public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap集合元素key部分元素的特点
		Map<Integer, String> map = new HashMap<>();

	}
}
