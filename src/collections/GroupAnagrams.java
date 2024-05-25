package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] words = {"The Morse Code", "The eyes", "silent", "Here come dots", 
				"listens", "Elegant man", "They see", "A gentleman", "enlist"};
		System.out.println(groupAnagrams(words));
	
	}

	public static List<List<String>> groupAnagrams(String[] s) {
		
		Map<String, List<String>> wordmap = new HashMap<>();
		for(String word : s) {
			char[] chars = word.replace(" ", "").toLowerCase().toCharArray();
			Arrays.sort(chars);
			String sortedString = new String(chars);
			if(!wordmap.containsKey(sortedString))
				wordmap.put(sortedString, new ArrayList<>());
			wordmap.get(sortedString).add(word);
		}
		return new ArrayList<>(wordmap.values());
	}
}
