// Write a program that checks if each element in an integer array is a prime number using a for loop.
package array;

import java.util.Scanner;

public class PrimeNumberCheck {

	private static Scanner scan = new Scanner(System.in);
	
	public PrimeNumberCheck() {}

	static boolean primeNumberChecker(int[] array) {
		for(int i=0; i<array.length; i++) {
			int currentElement = array[i];
			if(currentElement<=1)
				return false;
			else {
				for(int j=2; j<Math.sqrt(currentElement)+1; j++) {
					if(currentElement%j == 0)
						return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Numbers : ");
		for(int i=0; i<size; i++) {
			System.out.print("array[" +(i+1)+"] : ");
			array[i] = scan.nextInt();
		}
		if(primeNumberChecker(array))
			System.out.println("All Elements in array are prime.");
		else
			System.out.println("All Elements in array are not prime.");
	}
}
