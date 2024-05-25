package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddArrays {

	private static Scanner scan = new Scanner(System.in);

	public EvenOddArrays() {
	}

	private static List<Integer> filterEvenNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				result.add(nums[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 5, 6, 7, 4, 10 };

		List<Integer> evenArray = filterEvenNumbers(nums);

		for (Integer n : evenArray)
			System.out.println(n + " ");

	}

}
