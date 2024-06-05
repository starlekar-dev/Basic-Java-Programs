package java8;

import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		int[] list = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		Arrays.stream(list).sorted().forEach(i -> System.out.print(i+ " "));
		System.out.println();
//		Arrays.stream(list).sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i+ " "));
		
		
		
//		What if again we want to convert it into array
		
		list = Arrays.stream(list).sorted().toArray();
		System.out.println(Arrays.toString(list));
		
	}

}
