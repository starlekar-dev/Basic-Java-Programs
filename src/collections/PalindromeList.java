package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PalindromeList {

	public static void main(String[] args) {
		List<Character> characters = new LinkedList<>(); 
		characters.add('R');
		characters.add('A');
		characters.add('D');
		characters.add('A');
		characters.add('R');
		List<Character> chars = new LinkedList<>(characters);
		Collections.reverse(characters);
		System.out.println(chars.equals(characters) ? "Palindrome" : "Not a Palindrome");
		
		
	}	

}
