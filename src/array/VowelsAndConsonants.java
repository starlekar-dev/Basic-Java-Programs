package array;

import java.util.Scanner;

public class VowelsAndConsonants {

	private static Scanner scan = new Scanner(System.in);
	
	public VowelsAndConsonants() {}

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		String str = scan.nextLine();
		int vowelsCount=0, consonantCount=0;
		
		char[] charArray = str.replaceAll(" ", "").toLowerCase().toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			char currentElement = charArray[i];
			if(currentElement == 'a' || currentElement == 'e' || currentElement == 'i' || 
					currentElement == 'o'|| currentElement == 'u' )
				vowelsCount++;
			else 
				consonantCount++;
		}
		System.out.println("Total Vowels in given String : " +vowelsCount);
		System.out.println("Total Consonants in given String : "+consonantCount);
	}

}
