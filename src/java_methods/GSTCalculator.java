package java_methods;

import java.util.Scanner;

public class GSTCalculator {

//	value = % * 100 / total;
	static float GstCalculator(float amount) {
		float gstAmount = (18 * 100) / amount;
		System.out.println("GST Amount :  " +gstAmount);
		return gstAmount;

	}

	static float netAmountCalculator(float gstAmount, float amount) {

		return gstAmount + amount;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		float amount = scan.nextFloat();

		System.out.println("Net Amount is : " + netAmountCalculator(GstCalculator(amount), amount));
		scan.close();
	}
}
