package array;
import java.util.Scanner;

public class SumOfArrayElements {
	private static Scanner scan = new Scanner(System.in);
	
	public SumOfArrayElements() {}

	public static double sumOfArray(double[] array) {
		double sum=0.0;
		for(int i=0; i<array.length; i++)
			sum += array[i];
		return sum;
	}
	
	public static void main(String[] args) {	
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();
		
		double[] array = new double[size];
		System.out.println("Enter Numbers : ");
		
		for(int i=0; i<size; i++) {
			System.out.println("array[" +(i+1)+"] : ");
			array[i] = scan.nextDouble();
		}
		System.out.println("Sum of elements present in array is : " +sumOfArray(array));
	}

}
