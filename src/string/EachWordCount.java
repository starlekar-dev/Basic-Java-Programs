package string;

import java.util.Arrays;

public class EachWordCount {

	public EachWordCount() {
	}

	public static void main(String[] args) {

	
		String s1 = "A warm welcome to you all. I am here to deliver a speech on India. "
				+ "India is one of the ancient civilizations in the world and is also the "
				+ "7th largest country in the world. India is one of the best countries "
				+ "in the world for many reasons, acceptance of people of other religions, "
				+ "the closely bonded family culture, the biggest democratic nation, and "
				+ "the fastest-growing economy. With 1.3 billion of population India is "
				+ "the second-largest country in the world. India is God’s favorite country "
				+ "to be blessed with all seasons -spring, summer, monsoon, autumn, pre-winter, "
				+ "and winter. People around the world also recognize India for its Bollywood "
				+ "stardom and Beauty pageants.    ";

		wordCounter(s1);
	}

	public static void wordCounter(String s1) {

		System.out.println(s1);
		String s = s1.trim().replaceAll("[-,.]", "");
		System.out.println(s);
		
		String[] words = s.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];
			if (!currentWord.isBlank()) {
				int count = 1;
				for (int j = i + 1; j < words.length; j++) {
					if (currentWord.equalsIgnoreCase(words[j])) {
						count++;
						words[j] = "";
					}
				}
				System.out.println(currentWord + " : " + count);
			}
		}
	}
}
