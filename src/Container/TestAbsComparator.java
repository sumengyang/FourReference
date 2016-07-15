package Container;

import java.util.*;

public class TestAbsComparator {
	public static void main(String[] args) {
		// 产生一个20个随机整数的数组（有正有负）
		Random rnd = new Random();
		Integer[] integers = new Integer[20];
		for (int i = 0; i < integers.length; i++)
			integers[i] = new Integer(rnd.nextInt(100)
					* (rnd.nextBoolean() ? 1 : -1));

		System.out.println("用Integer内置方法排序：");
		Arrays.sort(integers);
		System.out.println(Arrays.asList(integers));

		System.out.println("用AbsComparator排序：");
		Arrays.sort(integers, new AbsComparator());
		System.out.println(Arrays.asList(integers));
	}
}