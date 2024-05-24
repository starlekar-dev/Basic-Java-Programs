// Write a Java program to remove a specific element from an array.

package array;

import java.util.Arrays;

public class RemoveElementFromArray {

	public RemoveElementFromArray() {
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20, 50, 40, 60, 100, 15 };
		int element = 50;

		int[] result = deleteElement(nums, element);
		if (result[0] != -1)
			System.out.println(Arrays.toString(result));
		else
			System.out.println("Element not found in Array");

	}

	public static int[] deleteElement(int[] nums, int element) {

		int[] result = new int[nums.length - 1];
		int index = linearSearch(nums, element);
		if (index != -1) {
			for (int i = 0; i < result.length; i++) {
				if (i < index)
					result[i] = nums[i];
				else
					result[i] = nums[i + 1];
			}
			return result;
		}

		else {
			result[0] = -1;
			return result;
		}
	}

	public static int linearSearch(int[] nums, int key) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key)
				return i;
		}
		return -1;
	}

}
