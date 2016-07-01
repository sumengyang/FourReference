package fourreference;

import java.util.HashMap;
import java.util.Map;

public class HashMapReference {
	public static void main(String[] args) {
		Map<String, String> list = new HashMap<String, String>();
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
				System.out.println(list.get(String.valueOf(1)));
			}
			i++;
		}
	}
}
