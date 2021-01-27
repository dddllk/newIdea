package day18.hash;

/*
	Hashtable的key和value都不能为空，如果有则报java.lang.NullPointerException异常

	HashMap和Hashtable底层都是哈希标结构。
	Hashtable的初始化容量是11，默认加载因子是0.75f
	Hashtable扩容量是原容量的2倍+1
 */

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest01 {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(null, 12);
//		map.put(12, null);
	}
}
