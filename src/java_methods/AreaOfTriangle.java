package java_methods;

import java.util.Scanner;

public class AreaOfTriangle {
	static Scanner scan = new Scanner(System.in);

	public static void areaOfRectangle(float base, float height) {
		System.out.println("\nArea of Triangle = " + (0.5 * base * height));

	}

	public static void main(String args[]) {
		System.out.println("Base : ");
		float base = scan.nextFloat();
		
		System.out.println("Height : ");
		float height = scan.nextFloat();

		areaOfRectangle(base, height);
	}
}
