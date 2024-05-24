package array;

import java.util.Arrays;

public class DuplicateElements1 {

	public DuplicateElements1() {
	}

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 5, 4, 8, 5 };

		int[] result = findDuplicateElements(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findDuplicateElements(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
					break;
				}
			}
		}

		int[] duplicateElements = new int[counter];
		counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					duplicateElements[counter] = nums[i];
					counter++;
					break;
				}
			}
		}
		

		return duplicateElements;
	}

}
