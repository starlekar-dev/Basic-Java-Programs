package datastructures;

import java.util.Scanner;


public class FormednessOfParenthesis {

	public FormednessOfParenthesis() {
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Input : ");
		String input = scan.nextLine();
		input = input.replaceAll(" ", "");

		System.out.println(expressionValidation(input) ? "Valid" : "Invalid");
	}

	
	public static boolean expressionValidation(String input) {
		StackChar s = new StackChar(input.length());
		
		for(int i=0; i<input.length(); i++) {
			char currentChar = input.charAt(i);
			if(currentChar == '(')
				s.push(currentChar);
			else if(currentChar == ')')
				s.pop();
			else
				break;
		}
	
		return s.isEmpty();
	}
	
}
