package ReadWrite;

import java.io.IOException;
//从控制台接收一个字符，然后将其打印出来
public class ReadAChar {
	public static void main(String[] args) throws IOException {
		System.out.println("please input a char:");
		char c = (char) System.in.read();
		System.out.println("your input is : " + c);
	}
}
