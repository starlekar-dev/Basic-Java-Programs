package java8;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Integer[] list = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		
		Arrays.stream(list).sorted().distinct().forEach(i -> System.out.print(i+ " "));
		
		
	}

}
