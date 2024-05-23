package java_methods;

import java.util.Scanner;

public class PrimeNumbers {

	public PrimeNumbers() {
	}

	static boolean checkForPrime(int checkNumber) {

		if (checkNumber <= 1)
			return false;

		for (int i = 2; i < Math.sqrt(checkNumber)+1; i++) {
			if (checkNumber % i == 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int checkNumber = scan.nextInt();

		
		
		
		if (checkForPrime(checkNumber))
			System.out.println(checkNumber + " is a prime number.");
		else
			System.out.println(checkNumber + " is not a prime number.");
		scan.close();
	}

}
