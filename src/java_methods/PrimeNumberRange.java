package java_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberRange {

	static Scanner scan = new Scanner(System.in);

	static boolean primeNumberRange(int checkNumber) {

		if (checkNumber <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
			if (checkNumber % i == 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println("Enter Start Range : ");
		int startRange = scan.nextInt();
		System.out.println("Enter End Range : ");
		int endRange = scan.nextInt();

		List<Integer> primeNumber = new ArrayList<>();

		for (int i = startRange; i < endRange; i++) {

			if (primeNumberRange(i)) {
				primeNumber.add(i);
			}
		}
		
	

		System.out.println("Prime Numbers between "+startRange+ " and "+endRange+ " are :");
		for (int num : primeNumber) {
			System.out.print(num+ " ");
		}

	}

}
