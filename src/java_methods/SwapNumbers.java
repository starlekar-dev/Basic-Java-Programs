package java_methods;
import java.util.Scanner;

public class SwapNumbers {

	private static Scanner scan = new Scanner(System.in);
	
	
	static void withoutThirdVariable(int number1, int number2) {
		int temp=0;
		
		System.out.println("Before Swapping");
		System.out.println("Number 1 : "+number1);
		System.out.println("Number 2 : "+number2);
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Before Swapping");
		System.out.println("Number 1 : "+number1);
		System.out.println("Number 2 : "+number2);
		
	}
	
	static void withThirdVariable(int number1, int number2) {
	
		System.out.println("Before Swapping");
		System.out.println("Number 1 : "+number1);
		System.out.println("Number 2 : "+number2);
		
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("Before Swapping");
		System.out.println("Number 1 : "+number1);
		System.out.println("Number 2 : "+number2);
	}
	
	private static void closeScanner() {
		scan.close();
	}
	
	public static void main(String args[]) {
		System.out.println("Enter First Number : ");
		int number1 = scan.nextInt();
		System.out.println("Enter First Number : ");
		int number2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Press 1 for Swap Numbers using third variable "
				+ "\nPress 2 for Swap Numbers without using third variable");
		int ch = scan.nextInt();
		
		switch(ch) {
			case 1: withThirdVariable(number1, number2);
				break;
		
			case 2: withoutThirdVariable(number1, number2);
				break;
		}
		
		closeScanner();
	}
}
