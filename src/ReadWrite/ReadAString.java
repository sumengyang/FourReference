package ReadWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//从控制台接收一个字符串，然后将其打印出来。在这个题目中，我们需要用到BufferedReader类和InputStreamReader类
public class ReadAString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("your input : " + str);
	}
}
