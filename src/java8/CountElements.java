/*

Given a list of integers, find the total number of elements present in the list using Stream functions

 */

package java8;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		System.out.println(list.stream().count());
	}

}
