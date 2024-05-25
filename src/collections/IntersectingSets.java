package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectingSets {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(20);
		list1.add(33);
		list1.add(17);
		list1.add(10);
		System.out.println(list1);
		
		System.out.println(intersectingElements(list, list1));
		
	}

	public static Set<Integer> intersectingElements(List<Integer> list, List<Integer> list1) {
		Set<Integer> intersect = new HashSet<>();
		for(Integer i : list)
			if(list1.contains(i))
				intersect.add(i);
		return intersect;
	}
}
