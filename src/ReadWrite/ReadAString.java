package ReadWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ӿ���̨����һ���ַ�����Ȼ�����ӡ�������������Ŀ�У�������Ҫ�õ�BufferedReader���InputStreamReader��
public class ReadAString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("your input : " + str);
	}
}
