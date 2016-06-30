package TestArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("Hello");
		list.add(0,"World");
		System.out.println(list);
		Collection<String> allCollection = null;
		allCollection = new ArrayList<String>();
		allCollection.add("smy");
		allCollection.add("www.baidu.com");
		list.addAll(allCollection);
		list.addAll(0,allCollection);
		System.out.println(list);
//		list.remove(0);
//		list.remove("World");
		System.out.println(list);
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

}
