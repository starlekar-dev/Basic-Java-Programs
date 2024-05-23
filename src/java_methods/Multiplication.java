package java_methods;

import java.util.Scanner;

public class Multiplication {
	static Scanner scan = new Scanner(System.in);

	public static int doMultiplication(int firstNumber, int secondNumber, int thirdNumber) {
		return (firstNumber * secondNumber * thirdNumber);
	}

	public static void main(String args[]) {
		System.out.println("Enter First Number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber = scan.nextInt();
		System.out.println("Enter Third Number : ");
		int thirdNumber = scan.nextInt();

		System.out
				.println("Addition of Entered Number is : " + doMultiplication(firstNumber, secondNumber, thirdNumber));

	}
}
