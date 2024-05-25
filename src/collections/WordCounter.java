package collections;
import java.util.HashMap;

public class WordCounter {
	
	
	public static void main(String[] args) {
		String sent = "Find the common elements between two Sets Find elements that are present "
				+ "in either of the Sets but not in both";
		
		System.out.println(wordCounter(sent));
	}

	public static HashMap<String, Integer> wordCounter(String s) {
		
		String[] words = s.toLowerCase().split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word : words) {
			if(wordCount.containsKey(word))
				wordCount.put(word, wordCount.get(word)+1);
			else
				wordCount.put(word, 1);
		}
		return wordCount;
	}

}
