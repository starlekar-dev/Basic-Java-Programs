package java_methods;

import java.util.Scanner;
import java.lang.Math;

public class SquareRoot {

	static int doAddition(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		System.out.println("Addition of Entered Number is : " + result);
		return result;
	}

	static float findSquareRoot(int result) {
		return (float) Math.sqrt(result);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber = scan.nextInt();

		float squareRoot = findSquareRoot(doAddition(firstNumber, secondNumber));
		System.out.println("Square Root is = " + squareRoot);

		scan.close();
	}
}

/* Output: -

Enter First Number : 
3
Enter Second Number : 
9
Addition of Entered Number is : 12
Square Root is = 3.4641016

*/