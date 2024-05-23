package java_methods;
import java.util.Scanner;

public class StringPalindrome {

	static boolean isPalindrome(String str) {
		
		str = str.replaceAll("\\s+", "").toLowerCase();

		int left=0, right=(str.length()-1);
		
		while(left <= right) {
			if(str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = scan.nextLine();
		
		if(isPalindrome(str))
			System.out.println("It is a Palindrome.");
		else
			System.out.println("Not a Palindrome");
	}
}
