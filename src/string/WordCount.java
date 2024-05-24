package string;

import java.util.Arrays;

public class WordCount {

	public WordCount() {
	}

	public static void main(String[] args) {

		String s1 = "India is my Country ";

		System.out.println("Total words in the String are : " + wordCounter(s1));
	}

	public static int wordCounter(String s) {

		int wordCount = 0;

//		String s1 = s.trim();
//		char[] characters1 = s1.toCharArray();
//		System.out.println(Arrays.toString(characters1));
//		for(int i=0; i<characters1.length; i++) {
//			if(characters1[i] == ' ')
//				wordCount++;
//		}
//		return wordCount;

		String[] s1 = s.split(" ");
		return s1.length;

	}

}
