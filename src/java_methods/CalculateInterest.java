package java_methods;

import java.util.Scanner;

public class CalculateInterest {

	static double calculateInterestAmount(double principalAmount, double interestRate) {
		double interestAmount = (principalAmount * interestRate) / 100;
		return interestAmount;
	}

	static double totalAmount(double principalAmount, double interestAmount) {
		double totalAmount = principalAmount + interestAmount;
		return totalAmount;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		double principalAmount = scan.nextDouble();

		System.out.println("Enter Interest Rate : ");
		double interestRate = scan.nextFloat();

		double interestAmount = calculateInterestAmount(principalAmount, interestRate);

		System.out.println("Interest Amount : " + interestAmount);

		System.out.println("Total Amount for the annual year is : " + totalAmount(principalAmount, interestAmount));

	}
}
