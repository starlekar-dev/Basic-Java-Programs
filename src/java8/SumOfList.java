/*

Given a list of integers, calculate the sum

 */

package java8;

import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		System.out.println(calculateSum(Arrays.asList(1, 2, 3, 4, 5)));
	}
	
	public static int calculateSum(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
		
//		return list.stream().reduce(0, Calculator :: add);
		
		
	}

}

class Calculator{
	
	public static int add(int a, int b) {
		return a+b;
	}
}
