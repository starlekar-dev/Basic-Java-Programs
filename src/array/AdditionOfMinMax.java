// Write a Java program to get the difference between the largest and smallest values in an array of integers. 
// The array must have a length of at least 1

package array;

import java.util.Arrays;

public class AdditionOfMinMax {

	public AdditionOfMinMax() {
	}

	static void bubbleSort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
	}

	private static int addMinMax(int[] nums) {

		bubbleSort(nums);
		return nums[nums.length - 1] - nums[0];
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 4, 9 };
		int result = addMinMax(nums);

		System.out.println("Result = " + result);
	}

}
