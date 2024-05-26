package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public DecimalToBinary() {
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int number = scan.nextInt();
		
		int bits = (int) (Math.log(number) / Math.log(2) + 1);
		Stack s = new Stack(bits);
		
		int counter = 0;
		int temp = number;
		while(temp > 0) {
			s.push(temp%2);
			temp = temp/2;
			counter++;
		}
		
		System.out.println("\n\n("+number+") base 10 : " +number);
		System.out.print("("+number+") base 2 : ");
		for(int i=0; i<counter; i++) {
			System.out.print(s.pop()+ " ");
		}
	}
}
