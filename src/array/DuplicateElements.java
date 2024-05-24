// Given an nums of integers, find all the elements that appear more than once in the nums.
// Write a Java program to find duplicate values in an array of integer values.

package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateElements {
	private static Scanner scan = new Scanner(System.in);

	public DuplicateElements() {
	}

	private static HashSet<Integer> findDuplicateElements(int[] nums) {
		
		HashSet<Integer> duplicateElements = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i == j)
					continue;
				if(nums[i] == nums[j]) {
					duplicateElements.add(nums[i]);
				}
			}
		}
		return duplicateElements;
	}

	public static void main(String[] args) {

		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();

		int[] nums = new int[size];
		System.out.println("Enter Numbers : ");

		for (int i = 0; i < size; i++) {
			System.out.print("nums[" + (i + 1) + "] : ");
			nums[i] = scan.nextInt();
		}

		HashSet<Integer> result = findDuplicateElements(nums);
		for(Integer num : result)
			System.out.print(num+ " ");
	}

}
