package Container;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

public class TestContainer{
	Collection<String> testList = new ArrayList<String>(Arrays.asList("i love you".split(" ")));
	Map<Integer, String> testMap = new HashMap<Integer, String>();

	TestContainer() {
		testMap.put(1, "I");
		testMap.put(2, "love");
		testMap.put(3, "you");
		System.out.println(testMap);
		System.out.println(testList);

		System.out.println("Using Iterable Interface");
		for (String str : testList) {
			System.out.println(str);
		}

		System.out.println("Geting the values collection of a Map");
		Collection<String> mapValues = testMap.values();
		for (String str : mapValues) {
			System.out.println(str);
		}

		System.out.println("Geting the Iterator of a collection");
		Iterator i = mapValues.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args){
		TestContainer tc = new TestContainer();
	}
	
}