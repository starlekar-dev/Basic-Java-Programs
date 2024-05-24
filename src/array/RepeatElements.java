// Find first repeating and non-repeating elements.

package array;

import java.util.Arrays;

public class RepeatElements {

	public RepeatElements() {
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 5 };

		Object repeatingElement = repeatingElement(nums);
		System.out.println(repeatingElement);

		Object nonRepeatingElement = nonRepeatingElement(nums);
		System.out.println(nonRepeatingElement);

	}

	public static Object repeatingElement(int[] nums) {
		Object result = new Object();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					result = nums[i];
					return result;
				}
			}
		}

		result = "No Repeating Element Found";
		return result;
	}

	public static Object nonRepeatingElement(int[] nums) {
		Object result = new Object();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] == nums[j])
					break;
				if(nums[i] != nums[j]) {
					
				}
//				else {
//					result = nums[i];
//					return result;
//				}
			}
		}
		result = "No Non-Repeating Element Found";
		return result;

	}

}
