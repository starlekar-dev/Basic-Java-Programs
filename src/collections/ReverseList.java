package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add(10);
		list.add("Sai");
		list.add(10.4f);
		list.add('a');
		System.out.println(list);
		reversedList(list);
		System.out.println(list);
	}

	
	public static void reversedList(List list) {
		Collections.reverse(list);
	}
	
	
}
