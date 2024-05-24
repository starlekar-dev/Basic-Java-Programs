// Write a Java program to find the index of an array element.

package array;

public class LinearSearch {

	public LinearSearch() {}

	public static void main(String[] args) {
		int[] nums = {10, 20, 50, 40, 60, 100, 15};
		int key = 100;
		
		int flag = linearSearch(nums, key);
		if(flag != -1)
			System.out.println("Key found at index : "+flag);
		else
			System.out.println("Key not found.");
		
		
	}

	public static int linearSearch(int[] nums, int key) {
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == key)
				return i+1;
		}
		return -1;
	}

}
