package TestGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Box<String> box = new Box<String>("corn");
			System.out.println(box.getData());
			System.out.println(box.getClass());
			Box<Integer> age = new Box<Integer>(25);
			System.out.println(age.getClass());
			
			//test list
			Collection arraylist = new ArrayList<String>();
			arraylist.add("test");
			String s = (String)arraylist.iterator().next();
			System.out.println(s);
			List list = new ArrayList<String>();
			List<String> lists = new ArrayList();
	}

}

class Box<T>{
	private T t;
	public Box(){
		
	}
	public Box(T data){
		this.t = data;
	}
	public  T getData(){
		return t;
	}
}