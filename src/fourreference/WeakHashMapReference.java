package fourreference;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapReference {
	public static void main(String[] args) {
		Map<String, String> list = new WeakHashMap<String, String>();
		long i = 1;
		while (i < 100000000L) {
			list.put(
					String.valueOf(i),
					"JDJJDJJJJJJJJJJ%%%%%%%%JJJJJJJJJJJJJJJKKKKKKKKKKKKKKKKKJJJJJJ"
							+ "JJJKKKKKHDDDJDJDJDJDJDJDJDJJDJDJDJDJDJDJJDJDJDJDJJDJDJJJJJJJJJ"
							+ "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ"
							+ "JJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
			//  测试第一个是否依然存活  
			if (i % 100000 == 0) {
				System.out.println(i + "  " + list.get(String.valueOf(1)));
			}
			i++;
		}
	}
}
