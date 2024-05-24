package array;

import java.util.Arrays;

public class PeakElements {

	public PeakElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20, 15, 2, 23, 90, 67 };

		int[] result = findPeakElements(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findPeakElements(int[] nums) {

		int[] elements = new int[nums.length];
		int counter=0;
		for(int i=1; i<nums.length-1; i++) {
			if((nums[i] > nums[i+1])  &&  (nums[i] > nums[i-1]) ) {
				elements[counter] = nums[i];
				counter++;
			}
		}
		
		int[] peakElements = new int[counter];
		System.arraycopy(elements, 0, peakElements, 0, counter);
		
		return peakElements;
	}

}
