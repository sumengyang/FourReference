package TestString;

public class TestChar {

	public TestChar() {

	}

	public int TestChar(int i) {
		return i;
	}

	public static void main(String[] args) {
		// charTest();
		TestChar tc = new TestChar();
		int result = tc.TestChar(5);
		System.out.println(result);
	}

	public static void charTest() {
		byte g = 'b'; // b��ӦASCII��98
		char h = (char) g;
		char i = 85; // U��ӦASCII��85
		int j = 'h'; // h��ӦASCII��104
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
}
