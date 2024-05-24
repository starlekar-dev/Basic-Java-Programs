package array;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		
		
//		Sorting using Arrays.sort
		System.out.println(Arrays.toString(sortUsingArrays(new Integer[] {8, 10, 6, 15, 9, 12})));
		
		
//		Sorting using Collections.sort
		System.out.println(Arrays.toString(sortUsingCollections(new Integer[] {8, 10, 6, 15, 9, 12})));
		
		
//		Sorting using BubbleSort
		int[] nums = {8, 10, 6, 15, 9, 12};
		sortUsingBubbleSort(nums);
		System.out.println(Arrays.toString(nums));
		
		
//		Sorting using InsertionSort
		int[] nums1 = {8, 10, 6, 15, 9, 12};
		sortUsingInsertionSort(nums1);
		System.out.println(Arrays.toString(nums1));
			
	}



	public static void sortUsingInsertionSort(int[] nums1) {
		int i, j;
		
		for(i = 1; i<nums1.length; i++) {
			int key = nums1[i];
			
			for(j = i - 1; j>=0 && nums1[j] > key; j--)
				nums1[j+1] = nums1[j];
			nums1[j+1] = key;
		}
	}
	public static void sortUsingBubbleSort(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
	}

	public static Integer[] sortUsingCollections(Integer[] nums) {
//		Collections.sort(Arrays.asList(nums), Collections.reverseOrder());
		Collections.sort(Arrays.asList(nums));
		return nums;
	}

	public static Integer[] sortUsingArrays(Integer[] nums) {
		Arrays.sort(nums, Collections.reverseOrder());
		Arrays.sort(nums);
		return nums;
	}

}
