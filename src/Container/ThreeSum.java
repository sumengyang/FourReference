package Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 13, -2, -5, -1, 10, 6, -8, 5, -5, 7, -5, -14, -4, -5,
				10, -15, -2, -14, -6, 10, 6, -14, -14, -9, -11, 8, -3, -2, 12,
				-9, -14, 3, 5, -12, -13, -8, 1, -14, 12, 12, 0, 14, 5, 4, -14,
				-8, 4, -9, -7, 14, -13, 6, 7, -12, 5, 12, 11, -13, -5, 0, -6,
				-12, -12, 6, 13, 12, 13, 0, 5, 2, -11, 13, 1, 9, 2, 2, -14, 13,
				8, -14, 4, 2, 8, -3, -3, -10, -14, -15, 14, -12, 1, -15, 14,
				-4, 6, 12, -6, -4, -3, 6, 5 };
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		int len = nums.length;
		for (int i = 0; i < len; i++)
			for (int j = i + 1; j < len; j++)
				for (int k = j + 1; k < len; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						int[] num = new int[] { nums[i], nums[j], nums[k] };
						Arrays.sort(num);
						ArrayList<Integer> list = new ArrayList<Integer>();
						for (int n : num)
							list.add(n);
						if (!result.contains(list))
							result.add(list);
					}
				}
		return result;
	}
}
