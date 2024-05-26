package datastructures;

import java.util.Scanner;

public class Palindrome {

	public Palindrome() {
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Input : ");
		String input = scan.next();

		StackChar s = new StackChar(input.length());

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			s.push(currentChar);
		}

		System.out.println(isPalindrome(s, input) ? "It is a Palindrome" : "Not a Palindrome");
	}

	public static boolean isPalindrome(StackChar s, String input) {

		if (s.size() == input.length()) {
			for (int i = 0; i < s.size(); i++) {
				char stackChar = s.pop();
				if (stackChar != input.charAt(i))
					return false;
			}
			return true;
		} else
			return false;
	}
}
