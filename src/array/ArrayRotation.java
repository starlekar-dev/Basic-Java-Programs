package array;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int index = 6;
		System.out.println(Arrays.toString(rotateRight(nums, index, nums.length)));
		System.out.println(Arrays.toString(rotateLeft(nums, index, nums.length)));
	}

	public static int[] rotateLeft(int[] nums, int index, int n) {
		int[] rotatedArray = new int[n];
		for(int i=0; i<n; i++)
			rotatedArray[(i - index + n) % n] = nums[i];
		return rotatedArray;
	}

	public static int[] rotateRight(int[] nums, int index, int n) {
		int[] rotatedArray = new int[n];
		for(int i=0; i<n; i++)
			rotatedArray[(index + i) % n] = nums[i];
		return rotatedArray;
	}
}
