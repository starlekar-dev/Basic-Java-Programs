package java_methods;

import java.util.Scanner;

public class VolumeOfBox {
	static Scanner scan = new Scanner(System.in);

	static float calculateVolume(float length, float breadth, float height) {

		return length * breadth * height;
	}

	public static void main(String args[]) {
		System.out.println("Length : ");
		float length = scan.nextFloat();

		System.out.println("Breadth : ");
		float breadth = scan.nextFloat();

		System.out.println("Height : ");
		float height = scan.nextFloat();

		System.out.print("Volume of Box : " + calculateVolume(length, breadth, height));

	}

}
