package array;

import java.util.Scanner;

public class StringChecker {

	static Scanner scan = new Scanner(System.in);
	
	public StringChecker() {}

	
	public static char stringChecker(String str, boolean value) {
		
//		char[] characters = str.toCharArray();	
//		return (value ? characters[0] : characters[characters.length-1]);
	
		return (value ? str.charAt(0) : str.charAt(str.length() - 1));	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String : ");
		String str = scan.nextLine();
		
		System.out.println("Enter Value : ");
		boolean value = scan.nextBoolean();
		
		System.out.println("Result : " +stringChecker(str, value));
	}

}
