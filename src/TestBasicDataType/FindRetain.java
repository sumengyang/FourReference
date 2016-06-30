package TestBasicDataType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,2,3,2};
		int[] nums2 = {1,2};
		int[] nums3 = intersection(nums1, nums2);
		System.out.println(intersection(nums1, nums2).length);
	}

	public  static int[] intersection(int[] nums1, int[] nums2) {

		if (nums1.length == 0)
			return nums2;
		if (nums2.length == 0)
			return nums1;

		List list1 = Arrays.asList(nums1);
		List list2 = Arrays.asList(nums2);
		Set<Integer> set1 = new HashSet<Integer>(list1);
		Set<Integer> set2 = new HashSet<Integer>(list2);

		set1.retainAll(set2);

		Integer[] result = set1.toArray(new Integer[set1.size()]);

		int res[] = new int[set1.size()];
		for (int i = 0; i < set1.size(); i++){
			System.out.println(result[i]);
			res[i] = result[i];
		}
		return res;

	}
}
