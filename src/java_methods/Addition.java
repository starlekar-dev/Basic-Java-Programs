package java_methods;

import java.util.Scanner;

public class Addition {

	static Scanner scan = new Scanner(System.in);

	public static int doAddition(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber);
	}

	public static void main(String args[]) {
		System.out.println("Enter First Number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber = scan.nextInt();
		System.out.println("Addition of Entered Number is : " + doAddition(firstNumber, secondNumber));
	}

}
