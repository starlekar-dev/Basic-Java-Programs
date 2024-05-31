/*

Given a list of integers, find out all the even numbers that exist in the list using Stream functions

 */

package java8;

import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(i -> (i % 2 == 0)).forEach(i -> System.out.print(i + " "));;
	}

}
