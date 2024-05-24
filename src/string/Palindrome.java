package string;

public class Palindrome {

	public Palindrome() {
	}

	public static void main(String[] args) {
		String s1 = "madam";
		if (isPalindrome(s1))
			System.out.println(s1 + " is Paindrome");
		else
			System.out.println(s1 + " is not a Paindrome");
	}

	public static boolean isPalindrome(String originalString) {

		String reversedString = "";
		
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}

		
		if (reversedString.equals(originalString))
			return true;
		else
			return false;
	}

}
