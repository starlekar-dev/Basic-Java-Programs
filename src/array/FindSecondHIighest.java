// Write a Java program to find the second largest element in an array.

package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondHIighest {

	private static Scanner scan = new Scanner(System.in);
	public FindSecondHIighest() {}
	public static void main(String[] args) {

		int[] nums = {20, 30, 10, 45, 38, 66, 35};
		System.out.println("Second Highest Number from nums is " + findSecondHighest(nums));
	}

	public static int findSecondHighest(int[] nums) {

		try {
			if(nums == null)
				throw new NullPointerException("Array is null");
			else if(nums.length < 1)
				throw new IllegalArgumentException("No element is present in array.");			
			else if(nums.length == 1)
				throw new IllegalArgumentException("Single element is present in array.");
			else {
				bubbleSort(nums);
				return nums[nums.length - 2];
			}
				
		}
		catch(Exception e) {
			System.out.println("Invalid Input : " +e.getMessage());
			System.exit(1);
			return -1;
		}
	}

	public static int[] bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}