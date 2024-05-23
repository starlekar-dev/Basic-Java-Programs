package java_methods;

import java.util.Scanner;

public class AreaOfCircle {
	static final float PI = 3.14f;
	static Scanner scan = new Scanner(System.in);

	public static void areaOfCircle(float radius) {
		System.out.println("\nArea of Circle = " + (PI * radius * radius));

	}

	public static void circumferenceOfCircle(float radius) {
		System.out.println("Circumference of Circle = " + (2 * PI * radius));
	}

	public static void main(String args[]) {
		System.out.println("Radius : ");
		float radius = scan.nextFloat();

		areaOfCircle(radius);
		circumferenceOfCircle(radius);
	}

}
