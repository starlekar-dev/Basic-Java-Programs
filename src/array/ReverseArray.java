package array;

import java.util.Arrays;

public class ReverseArray {

	public ReverseArray() {}

	public static void main(String[] args) {
		int[] nums = {8, 3, 5, 6, 1, 2};
		System.out.println(Arrays.toString(reverseArray(nums)));
	}

	public static int[] reverseArray(int[] nums) {

		int[] result = new int[nums.length];
		int counter=0;
		for(int i=nums.length-1; i>=0; i--) {
			result[counter] = nums[i];
			counter++;
		}
		
		return result;
	}

}
