package string;

public class CountCharacters {

	public CountCharacters() {}

	public static void main(String[] args) {

		String s = "Create a program";
		char element = 'a';
		
		
		System.out.println(element+" is present " +countOccurrences(s, element)+ " time(s) in the sentence.");
	}

	public static int countOccurrences(String s, char element) {

		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char currentElement = s.charAt(i);
			if(currentElement == element) {
				count++;
			}
		}
		
		return count;
	}

}
