package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public ProductOfArrayExceptSelf() {}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		int[] result = findProduct(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findProduct(int[] nums) {
		
		int[] result = new int[nums.length];
		int res=1;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i == j)
					continue;
				else {
					res *= nums[j];
				}
			}
			result[i] = res;
			res = 1;
		}
		
		
		return result;
	}

}
