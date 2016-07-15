package Container;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Integer i1 = 150;
		Integer i2 = 150;
		System.out.println(i1 == i2);

		final Object object = new Object();
		Map map = new HashMap<Integer, String>();
		map.put(i1, object);
		map.put(i2, object);
		System.out.println(map);

	}

}
