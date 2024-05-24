package array;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] nums = {8, 5, 4, 10, 6, 12, 9, 15};
		
//		Using Customized Method
		findMaxMin(nums);
		
//		Using Arrays.sort()
		findMaxMin1(nums);
	}

	public static void findMaxMin1(int[] nums) {
		Arrays.sort(nums);
		System.out.println("Max : " +nums[nums.length-1]);
		System.out.println("Min : " +nums[0]);
	}

	public static void findMaxMin(int[] nums) {
		
		int min = nums[0], max = nums[0];
	
		for(int n : nums) {
			if(min > n)
				min = n;
			if(max < n)
				max = n;
		}

		System.out.println("Max : " +max);
		System.out.println("Min : " +min);
	}

}
