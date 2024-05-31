package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMatcher {

	public static void main(String[] args) {
		List<String> listOfString = wordMatcher("Shriram Jayram Hareram Ramkrishna Hari", "Ram");
//		listOfString.stream().forEach(str -> System.out.println(str));
		listOfString.stream().forEach(System.out :: println);
	}
	

	public static List<String> wordMatcher(String str, String keyword){
				
		String[] words = str.split(" ");
		return Arrays.stream(words).filter(word -> word.toLowerCase().contains(keyword.toLowerCase()))
				.collect(Collectors.toList());
	}

}
