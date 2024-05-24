// Write a Java program to find common elements between two arrays

package array;

import java.util.Arrays;

public class CommonElements {

	public CommonElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 5 };
		int[] nums2 = { 4, 5, 6, 2 };

		int[] result = findCommonElements(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findCommonElements(int[] nums1, int[] nums2) {

		int size = nums1.length < nums2.length ? nums1.length : nums2.length;
		int[] commonElements = new int[size];

		int counter = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					commonElements[counter] = nums1[i];
					counter++;
					break;
				}
			}
		}

		return commonElements;
	}

}
