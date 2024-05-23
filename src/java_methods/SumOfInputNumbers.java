package java_methods;

import java.util.Scanner;

public class SumOfInputNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double sum = 0.0;
		System.out.println("Start Entering the Numbers : ");
		while (scan.hasNextInt()) {
			double number = scan.nextDouble();
			if (number < 0.0)
				break;
			else
				sum += number;
		}
		System.out.println("Sum of Entered Number is : " + sum);
	}
}
