package string;

public class VowelCounter {

	public VowelCounter() {
	}


	public static void main(String[] args) {
		String s1 = "India is my Country";
		
		System.out.println("Vowel Counter : " +countVowels(s1));
	}

	public static int countVowels(String s) {

		
		int vowel=0;
		String s1 = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char currentElt = s1.charAt(i);
			if(currentElt == 'a' || currentElt == 'e' || currentElt == 'i' || 
					currentElt == 'o' || currentElt == 'u') {
				vowel++;
			}
		}
		
		return vowel;
	}

}
