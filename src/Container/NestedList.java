package Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NestedList {

	public static void main(String[] args) {

		List<List<Integer>> result = listList();
		System.out.println(result);
	}

	private static List<List<Integer>> listList() {
		List<List<Integer>> result = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++)
				list.add(rand.nextInt(100));
			result.add(list);
		}
		System.out.println(result);
		return result;
	}
}
