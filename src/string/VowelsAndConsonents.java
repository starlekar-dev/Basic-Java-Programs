package string;

public class VowelsAndConsonents {

	public VowelsAndConsonents() {
	}

	public static void main(String args[]) {
		String input = "India is my Country";

		countVowelsAndConsonents(input);
	}

	public static void countVowelsAndConsonents(String s) {

		int vowelCount = 0, consonentCount = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if(currentChar >= 'a' && currentChar <= 'z') {
				if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
						|| currentChar == 'u')
					vowelCount++;
				else
					consonentCount++;
			}
		}
		
		System.out.println("Total Vowels : " +vowelCount);
		System.out.println("Total Consonents : " +consonentCount);
	}

}
