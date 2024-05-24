package array;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectNumber {

	public PerfectNumber() {
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();

		int perfectNumber = findPerfectNumber(num);

		System.out.println((num == perfectNumber) ? "It is a Perfect Number." : "It is not a Perfect Number.");

	}

	public static int findPerfectNumber(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		int[] factors = new int[count];
		count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				factors[count] = i;
				count++;
			}
		}

		int sum = 0;
		for (int i = 0; i < factors.length; i++) {
			sum += factors[i];
		}

		return sum;
	}

}
