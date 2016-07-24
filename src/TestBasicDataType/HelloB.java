package TestBasicDataType;

public class HelloB extends HelloA {
	public HelloB() {
		System.out.println("hello B");
	}

	{
		System.out.println("I am a hello B class");
	}
	static {
		System.out.println("static hello B");
	}

	public static void main(String[] args) {
		System.out.println("start Main:");
		new HelloB();
		new HelloB();
		System.out.println("end Main.");
	}

}

class HelloA {
	public HelloA() {
		System.out.println("hello A");
	}

	{
		System.out.println("I am a hello A class");
	}

	static {
		System.out.println("static hello A");
	}
}