package array;

import java.util.Arrays;

public class AddAndDeleteElement {

	public static void main(String[] args) {
		int[] nums = {2, 4, 6, 8, 10};
		
		
//		Adding Element at the end
//		int element = 2;
//		System.out.println(Arrays.toString(addElement(nums, element)));
		
		
//		Adding Element at a specified index
//		int element = 12;
//		int index = 8;
//		System.out.println(Arrays.toString(addElement(nums, element, index)));
		
		
		
//		Delete first occurrence of the specified element
//		int element = 8;
//		System.out.println(Arrays.toString(deleteElement(nums, element)));
		
		
//		Delete element at the specified index
//		int index = 2;
//		System.out.println(Arrays.toString(deleteElementAtIndex(nums, index)));
		
	}

	public static int[] deleteElementAtIndex(int[] nums, int index) {
		int[] copy = new int[nums.length-1];
		try {
			System.arraycopy(nums, 0, copy, 0, index);
			System.arraycopy(nums, index+1, copy, index, nums.length-index-1);
			return copy;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index exceeds the length of array");
			return nums;
		}
	}
	public static int[] deleteElement(int[] nums, int element) {

		int[] copy = new int[nums.length-1];
		
//		Method 1
		int index = 0;
		try {
			for(index=0; index<nums.length; index++) {
				if(nums[index] == element)
					break;
			}
			if(index == nums.length)
				throw new IllegalArgumentException();
		}

		catch(IllegalArgumentException e) {
			System.out.println("Specified Element Not Found");
			return nums;
		}
		
		System.arraycopy(nums, 0, copy, 0, index);
		System.arraycopy(nums, index+1, copy, index, nums.length-index-1);
	
		return copy;

		
		
//		Method 2
/*		int index;
		try {
			for(index=0; index<nums.length; index++) {
				if(nums[index] == element)
					break;
			}
			if(index == nums.length)
				throw new IllegalArgumentException();
		}

		catch(IllegalArgumentException e) {
			System.out.println("Specified Element Not Found");
			return nums;
		}
		
		
		for(int i=0; i<index; i++)
			copy[i] = nums[i];
		
		for(int i=index+1; i<nums.length; i++)
			copy[index++] = nums[i];
		
		return copy;
*/		
	}
	public static int[] addElement(int[] nums, int element, int index) {
		int[] copy = new int[nums.length+1];

		
//		Method 1
		
		try {
			System.arraycopy(nums, 0, copy, 0, index);
			copy[index] = element;
			System.arraycopy(nums, index, copy, index+1, nums.length-index);
			return copy;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index exceeds the length of array");
			return nums;
		}
		
		
		
/*		Method 2
		try {
			if(index <= nums.length) {
				for(int i=0; i<index; i++) {
					copy[i] = nums[i];
				}
				copy[index] = element;
				for(int i=index; i<nums.length; i++) {
					copy[++index] = nums[i];
				}
				return copy;
			}
			else
				throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index exceeds the length of array");
			return nums;
		}
*/
	
	}
	public static int[] addElement(int[] nums, int element) {
		int[] copy = Arrays.copyOf(nums, nums.length+1);
		
		
//		Method 1 : 
		nums[nums.length-1] = element;
		return nums;
		
		
/*		Method 2:
		int count = 0;
		for(int n : nums)
			copy[count++] = n;
		
		copy[copy.length-1] = element;
		
		return copy;
*/
	}
}
