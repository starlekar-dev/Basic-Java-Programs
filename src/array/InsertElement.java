// Write a Java program to insert an element (specific position) into an array.

package array;

import java.util.Arrays;

public class InsertElement {

	public InsertElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] nums = {2, 3, 3 , 2, 1};
		int element = 4;
		int index = 0;

		int[] result = insertElement(nums, element, index);
		if (result[0] != -1)
			System.out.println(Arrays.toString(result));
		else
			System.out.println("Check if array is null or Enter proper index.");

	}
	
	
	public static int[] insertElement(int[] nums, int element, int index) {

		int[] result = new int[nums.length + 1];
		if (index >= 0 && index < result.length) {
			for (int i = 0; i < result.length; i++) {
				if (i < index)
					result[i] = nums[i];
				
				else if(i == index)
					result[i] = element;
				
				else
					result[i] = nums[i-1];
			}
			return result;
		}

		else {
			result[0] = -1;
			return result;
		}
	}

}
