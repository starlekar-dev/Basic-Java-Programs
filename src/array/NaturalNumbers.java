// Question Array Initialization:
// Write a program to initialize an integer array with the first N natural numbers (1 to N) using a for loop.


package array;

import java.util.Scanner;

public class NaturalNumbers {

	private static Scanner scan = new Scanner(System.in);
	
	public NaturalNumbers() {}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter Numbers : ");
		int num=0;
		for(int i=0; i<size; i++) {
			System.out.print("array[" +(i+1)+"] : ");
			num = scan.nextInt();
			
			try {
				if(num<=0)
					throw new IllegalArgumentException("Negative numbers and 0 is not included in Natural Numbers.");
				else
					array[i] = num;					
			}
			catch(Exception e){
				System.err.println("Invalid Input : "+e.getMessage());
				System.exit(1);
			}
		}
		
		
		System.out.println("Natural Numbers : ");
		for(int n:array)
			System.out.print(n+ " ");
	}

}
