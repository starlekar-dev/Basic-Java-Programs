// Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

package array;
import java.util.Arrays;

public class AdditionOfPairs {

	public AdditionOfPairs() {
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int sum = 9;

		int[][] result = findPairs(nums, sum);
		System.out.println("All Pairs for given sum are : ");

		for (int[] num : result)
			System.out.println(Arrays.toString(num));

	}

	public static int[][] findPairs(int[] nums, int sum) {

		int length = nums.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				int result = 0;
				if (i < j) {
					result = nums[i] + nums[j];
					if (result == sum) {
						count++;
						break;
					}
				} else
					continue;
			}
		}
		
		int[][] pairOfArrays = new int[count][2];
		count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				int result = 0;
				if (i < j) {
					result = nums[i] + nums[j];
					if (result == sum) {
						pairOfArrays[count] = new int[] { nums[i], nums[j]};
						count++;
						break;
					}
				} else
					continue;
			}
		}
		return pairOfArrays;
	}

}
