package ReadWrite;

import java.util.Scanner;

public class ReadAllKinds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		String name = sc.nextLine();
		System.out.println("������������䣺");
		int age = sc.nextInt();
		System.out.println("��������Ĺ��ʣ�");
		float salary = sc.nextFloat();
		System.out.println("�����Ϣ���£�");
		System.out.println("������" + name + "\n" + "���䣺" + age + "\n" + "���ʣ�"
				+ salary);
	}
}
