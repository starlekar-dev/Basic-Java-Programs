package array;
import java.util.Scanner;
public class MaxElementFromArray {

	
	private static Scanner scan = new Scanner(System.in);

	public MaxElementFromArray() {}

	public static int maxElement(int[] array) {
		int max=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i] >= max)
				max = array[i];
		}
		
		return max;
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
		System.out.println("Max element present in array is : " +maxElement(array));
	}
}
