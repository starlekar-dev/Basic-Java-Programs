package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReversal {

	public static void main(String[] args) {

//		Using for Loop
		System.out.println(Arrays.toString(reverseArray(new int[] {8, 5, 4, 10, 6, 12, 9, 15})));
		
//		Using while Loop
		System.out.println(Arrays.toString(reverseArray1(new int[] {8, 5, 4, 10, 6, 12, 9, 15})));
		
//		Using Collections
		System.out.println(reverseArray2(new int[] {8, 5, 4, 10, 6, 12, 9, 15}));
	}

	public static List<Integer> reverseArray2(int[] nums) {
		
		List<Integer> numbers = new ArrayList<>();
		for(Integer n : nums)
			numbers.add(n);
		Collections.reverse(numbers);
		return numbers;
	}

	private static int[] reverseArray1(int[] nums) {

		int i = 0, j = nums.length-1;
		while(i < j) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;

			i++; j--;
			
		}
		return nums;
	}

	private static int[] reverseArray(int[] nums) {

		for(int i=0, j=nums.length-1; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		
		return nums;
	}

}
