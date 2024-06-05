/*

Given a list of strings, find the longest string using the reduce method.

 */


package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
        
        System.out.println(longestString(Arrays.asList("appleee", "banana", "cherry", "date")));
	}
	
	public static Optional<String> longestString(List<String> words) {
		return  words.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
	}

}
