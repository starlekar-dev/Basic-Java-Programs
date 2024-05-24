package array;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter numbers in array :");
		for (int i = 0; i < size; i++)
			nums[i] = scan.nextInt();
		calculateMinMax(nums);
	}

	public static void calculateMinMax(int[] nums) {
		int min = nums[0], max = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min)
				min = nums[i];
			if(nums[i] > max)
				max = nums[i];
		}
		System.out.println("Max elemnt : "+max);
		System.out.println("Min elemnt : "+min);
	}
}
