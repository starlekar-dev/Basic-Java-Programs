// Question: Remove all white spaces from a string.

package string;

public class RemoveWhiteSpaces {

	public RemoveWhiteSpaces() {}

	public static void main(String[] args) {
		String input = "My name is       Sai";
		System.out.println(removeSpaces(input));
		System.out.println(removeSpaces1(input));
	}

	public static char[] removeSpaces1(String s) {
		
		char[] chars = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
//			if()
		}
		
		return null;
	}

	public static String removeSpaces(String s) {		
		return s.replace(" ", "");
	}
	
	
	

}
