package java_methods;

import java.util.Scanner;
import java.util.ArrayList;

public class Armstrong {
	static Scanner scan = new Scanner(System.in);
	
	static ArrayList<Integer> checkArmstrong(int start, int end) {
		
		int rem = 0, result = 0;
		ArrayList<Integer> armstrong = new ArrayList<>();

		for (int num = start; num <= end; num++) {
			int i = num;
			int length = String.valueOf(i).length();
			while (i > 0) {
				rem = i % 10;
				result = (int) (result + Math.pow(rem, length));
				i = i / 10;
			}

			if (num == result) {
				armstrong.add(num);
			}
			result = 0;

		}
		return armstrong;
	}

	public static void main(String args[]) {
		System.out.println("Enter Start Range : ");
		int start = scan.nextInt();
		System.out.println("Enter End Range : ");
		int end = scan.nextInt();

		System.out.println("Arsmstrong Numbers between " + start + " and " + end + " are :");

		ArrayList<Integer> armstrongnum = checkArmstrong(start, end);
		for (int num : armstrongnum) {
			System.out.print(num + " ");
		}
	}
}
