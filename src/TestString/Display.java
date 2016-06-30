package TestString;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Display{
	private List<String> list = new ArrayList<String>();
	
	public Display(){
		list.add("asf");
		list.add("123");
		list.add("asf1");
		list.add("1231");
		list.add("asf2");
		list.add("1232");
	}
	
		
	public void display(){
	for(String s : list){
		System.out.println(s);
	}
	
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()){
		String s = iterator.next();
		System.out.println(s);
	}
		
}
}