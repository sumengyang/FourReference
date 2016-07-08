package TestString;

public class TestNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNull tn = new TestNull();
		tn.get(null);
	}
	public void get(String s){
		System.out.println("null is String");
	}
	public void get(Object i){
		System.out.println("null is Integer");
	}
}
