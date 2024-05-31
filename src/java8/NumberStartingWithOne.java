/*

Given a list of integers, find out all the numbers starting with 1 using Stream functions

 */


package java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream()
			.map(element -> element + "")
			.filter(element -> element.startsWith("1"))
			.forEach(element -> System.out.print(element + " "));
	}

}
