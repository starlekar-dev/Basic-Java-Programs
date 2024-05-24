package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadAndDisplay {
	static Scanner scan = new Scanner(System.in);

	static int[] readArrays(int size) {

//		int index = 0;
		int[] array = new int[5];

		System.out.println("Enter Numbers (Press x to stop) : ");

		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		return array;
	}

	static void displayArrays(int[] array) {

		System.out.println("Entered Numbers are : ");
		for (int num : array) {
			System.out.println(num + " ");
		}
	}

	public static void main(String args[]) {

//		System.out.println("Hello!! \nDo you know size of the Array (Y/N): ");
//		char ch = scan.next().charAt(0);
		System.out.println("Enter Array Size : ");
		int size = scan.nextInt();
		try {
			int[] array = readArrays(size);
			displayArrays(array);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Error.");
		}

		catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception. Print only Integers");
		}

	}
}
