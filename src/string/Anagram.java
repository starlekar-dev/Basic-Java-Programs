package string;

public class Anagram {

	public Anagram() {
	}

	public static void main(String[] args) {
		String firstWord = "William Shakespeare";
		String secondWord = "I'll make a wise phrase.";

		System.out.println(isAnagram(firstWord, secondWord) ? "Is Anagram" : "Not a Anagram");

	}

	public static boolean isAnagram(String firstWord, String secondWord) {

		firstWord = firstWord.replaceAll("[ .',-]", "").toLowerCase();
		secondWord = secondWord.replaceAll("[ .',-]", "").toLowerCase();
		System.out.println(firstWord + "\n" + secondWord);

		if (firstWord.length() == secondWord.length()) {
			char[] secondWordChars = secondWord.toCharArray();

			for (int i = 0; i < firstWord.length(); i++) {
				char currentWord = firstWord.charAt(i);
				for (int j = 0; j < secondWordChars.length; j++) {
					if (currentWord == secondWordChars[j]) {

						secondWordChars[j] = ' ';
						break;
					}
				}
			}

			for (int i = 0; i < secondWordChars.length; i++) {
				if (secondWordChars[i] != ' ')
					return false;
			}
			return true;
		}

		else
			return false;

	}

}
