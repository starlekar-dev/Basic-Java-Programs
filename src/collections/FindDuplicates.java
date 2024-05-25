package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);
		System.out.println(findDuplicates(list));

	}

	public static List<Integer> findDuplicates(List<Integer> list) {
		List<Integer> duplicates = new ArrayList<>();
		Set<Integer> unq = new HashSet<Integer>();
		for(Integer i : list) 
			if (!unq.add(i))
				duplicates.add(i);
		return duplicates;
	}

}
