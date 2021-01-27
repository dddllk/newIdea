package day18.hash;
/*
	HashMap集合key部分运行null吗？
		允许：
			但是：HashMap集合的key为null值只能有一个。
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapTest03 {
	public static void main(String[] args) {
		Map map = new HashMap();

		// HashMap集合运行key为null
		map.put(null, null);
		System.out.println(map.size());//1

		//
		map.put(null, 100);
		System.out.println(map.size());//1

		System.out.println(map.get(null));//100
	}
}
