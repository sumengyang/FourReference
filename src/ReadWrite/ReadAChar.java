package ReadWrite;

import java.io.IOException;
//�ӿ���̨����һ���ַ���Ȼ�����ӡ����
public class ReadAChar {
	public static void main(String[] args) throws IOException {
		System.out.println("please input a char:");
		char c = (char) System.in.read();
		System.out.println("your input is : " + c);
	}
}
