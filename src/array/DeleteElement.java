package array;

import java.util.Arrays;

public class DeleteElement {

	public DeleteElement() {}

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5};
		int value = 3;
		
		int[] result = deleteElement(nums, value);
		System.out.println(Arrays.toString(result));
		
	}

	public static int[] deleteElement(int[] nums, int value) {

		int[] updatedNums = new int[nums.length-1];
		int counter = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != value) {
				updatedNums[counter] = nums[i];
				counter++;
			}
		}
		
		return updatedNums;
	}

}
