package Container;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		hashSet();
		linkedHashSet();
		treeSet();
	}

	private static void hashSet() {
		HashSet h = new HashSet();
		h.add("1st");
		h.add("2nd");
		h.add(new Integer(300));
		h.add(new Double(4.0));
		h.add("2nd"); // �ظ�Ԫ�أ�δ�����
		h.add(new Integer(300)); // �ظ�Ԫ�أ�δ�����
		h.add(new Date());

		h.add("hello");
		h.add(new String("hello"));

		System.out.println("��ʼ��size=" + h.size());
		Iterator it = h.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		h.remove("2nd");
		System.out.println("�Ƴ�Ԫ�غ�size=" + h.size());
		System.out.println(h);
	}

	private static void treeSet() {

		TreeSet ts = new TreeSet();
		ts.add("orange");
		ts.add("apple");
		ts.add("banana");
		ts.add("grape");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			String fruit = (String) it.next();
			System.out.println(fruit);
		}

	}
	private static void linkedHashSet() {

		Set ts = new LinkedHashSet();
		ts.add("orange");
		ts.add("apple");
		ts.add("banana");
		ts.add("grape");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			String fruit = (String) it.next();
			System.out.println(fruit);
		}

	}
}