package java_methods;

import java.util.Scanner;

public class ExpressionEvaluation {

	private static Scanner scan = new Scanner(System.in);

	static float evaluateExpression(float x, float y) {
		float Z = 0.0f;

		Z = (float) ((4 * (Math.pow(x, 2))) + (5 * (Math.pow(y, 3)))) / (2 * x * y);
		return Z;
	}

	private static void closeScanner() {
		scan.close();
	}

	public static void main(String args[]) {
		System.out.println("Enter Value for X : ");
		float valueofX = scan.nextFloat();
		System.out.println("Enter Value for Y : ");
		float valueofY = scan.nextFloat();
		scan.nextLine();

		System.out.println("Z = " + evaluateExpression(valueofX, valueofY));

		closeScanner();
	}
}
