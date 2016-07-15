package Container;

import java.util.*;

public class TestAbsComparator {
	public static void main(String[] args) {
		// ����һ��20��������������飨�����и���
		Random rnd = new Random();
		Integer[] integers = new Integer[20];
		for (int i = 0; i < integers.length; i++)
			integers[i] = new Integer(rnd.nextInt(100)
					* (rnd.nextBoolean() ? 1 : -1));

		System.out.println("��Integer���÷�������");
		Arrays.sort(integers);
		System.out.println(Arrays.asList(integers));

		System.out.println("��AbsComparator����");
		Arrays.sort(integers, new AbsComparator());
		System.out.println(Arrays.asList(integers));
	}
}