package array;

import java.util.Scanner;

public class SelectionSort {

	private static Scanner scan = new Scanner(System.in);

	public SelectionSort() {
	}

	static int[] sortingArray(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			int smallest = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[smallest] > nums[j])
					smallest = j;
			}
			int temp = nums[smallest];
			nums[smallest] = nums[i];
			nums[i] = temp;
		}
		return nums;
	}

	
	public static void main(String[] args) {
		
		int[] nums = {10, 30, 50, 23, 18, 34, 5, 8};
		
		int[] sortedArray = sortingArray(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
		scan.close();
	}

}
