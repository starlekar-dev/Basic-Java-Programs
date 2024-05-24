/*
Even and Odd Numbers:
Write a method that separates even and odd numbers from an array using a for loop and return a 2d array.
*/


package array;
import java.util.Scanner;

public class EvenOddArrays {

	private static Scanner scan = new Scanner(System.in);
	public EvenOddArrays() {}

	public static int[][] getEvenOddArrays(int[] array, int size){
		int evenCounter = 0, oddCounter = 0;
		for(int i=0; i<size; i++) {
			if(array[i]%2 == 0) {
				evenCounter++;
			}
			else {
				oddCounter++;
			}
		}
			
		int[] evenNumbers = new int[evenCounter];
		int[] oddNumbers = new int[oddCounter];
		
		evenCounter = 0;
		oddCounter = 0;
 		
		for(int i=0; i<size; i++) {
			if(array[i]%2 == 0) {
				evenNumbers[evenCounter] = array[i];
				evenCounter++;
			}
			else {
				oddNumbers[oddCounter] = array[i];
				oddCounter++;
			}
		}	
		int[][] resultArray = {evenNumbers, oddNumbers};
		return resultArray;
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
				
		int[] evenNumbers = getEvenOddArrays(array, size)[0];
		int[] oddNumbers = getEvenOddArrays(array, size)[1];
		
		System.out.println("\n\nEven Numbers : ");
		for(int n : evenNumbers)
			System.out.print(n+ " ");
		
		System.out.println("\nOdd Numbers : ");
		for(int n : oddNumbers)
			System.out.print(n+ " ");
	}
}
