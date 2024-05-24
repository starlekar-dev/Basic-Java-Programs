// Implement a function to rotate elements of an array to the left or right by a certain number of positions.
package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter numbers in array :");
		for (int i = 0; i < size; i++)
			nums[i] = scan.nextInt();

		System.out.println("Enter desired position : ");
		int posi = scan.nextInt();
		
		System.out.println(Arrays.toString(rotateRight(nums, posi)));
		System.out.println(Arrays.toString(rotateLeft(nums, posi)));
	}
	
	// 5 1 2 3 4
	public static int[] rotateRight(int[] nums, int posi) {
		int[] rotatedArray = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(posi+i < nums.length) {
				rotatedArray[posi+i] = nums[i];
			}
			else {
				int diff = (posi+i) - nums.length;
				rotatedArray[diff] = nums[i];
			}
		}
		return rotatedArray;
	}
	

	// 2 3 4 5 1
	public static int[] rotateLeft(int[] nums, int posi) {
		int[] rotatedArray = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(i-posi >= 0) {
				rotatedArray[i-posi] = nums[i];
			}
			else {
				int diff = (i-posi) + (nums.length);
				rotatedArray[diff] = nums[i];
			}
		}
		return rotatedArray;
	}
}
