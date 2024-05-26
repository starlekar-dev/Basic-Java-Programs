package datastructures;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
	
		Stack s = new Stack();
		
		
		for(int i=1; i<=5; i++)
			s.push(i);
		
		System.out.println(s);
		System.out.println(s.search(2));
		int[] copy = s.toArray();
		System.out.println(Arrays.toString(copy));
		
	}

}
