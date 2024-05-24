package array;

import java.util.Arrays;

public class IntersectionAndUnion {

	public IntersectionAndUnion() {}

	public static void main(String[] args) {
		
		int[] nums1 = { 1, 2 , 3, 4 };
		int[] nums2 = {2, 5, 3, 1};
		
		
		System.out.println("Intersection  : "+Arrays.toString(findInterstion(nums1, nums2)));
		System.out.println("Union  : "+Arrays.toString(findUnion(nums1, nums2)));
	}

	public static int[] findInterstion(int[] nums1, int[] nums2) {
		int n = nums1.length, m = nums2.length;
		int[] elements = new int[(n < m) ? n : m];
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (nums1[i] == nums2[j]) {
					elements[count++] = nums1[i];
					break;
				}
			}
		}

		int[] intersection = new int[count];
		for (int i = 0; i < count; i++) {
			intersection[i] = elements[i];
		}
		return intersection;
	}

	
	public static int[] findUnion(int[] nums1, int[] nums2) {

		
		int n = nums1.length, m = nums2.length;
		int[] elements = new int[n+m];
		
		System.arraycopy(nums1, 0, elements, 0, n);
		
		int count = n;
		boolean flag = true;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<elements.length; j++) {
				if(nums2[i] != elements[j]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag)
				elements[count++] = nums2[i];
		}
		
		int[] union = new int[count];
		for (int i = 0; i < count; i++) {
			union[i] = elements[i];
		}
		return union;		
	}

}
