package java_methods;

import java.util.Scanner;

public class AreaOfRectangle {
	static Scanner scan = new Scanner(System.in);

	public static void areaOfRectangle(float length, float breadth) {
		System.out.println("\nArea of Circle = " + (length * breadth));

	}



	public static void main(String args[]) {
		System.out.println("Length : ");
		float length = scan.nextFloat();
		
		System.out.println("Breadth : ");
		float breadth = scan.nextFloat();

		areaOfRectangle(length, breadth);
	}
}
