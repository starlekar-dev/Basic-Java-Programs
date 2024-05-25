package collections;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(10);
		System.out.println(set);

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(11);
		set1.add(20);
		set1.add(33);
		set1.add(17);
		set1.add(10);
		System.out.println(set1);
		
		System.out.println(symmetricDiff(set, set1));
	}

	public static Set<Integer> symmetricDiff(Set<Integer> set, Set<Integer> set1) {

		Set<Integer> diff = new HashSet<>();
		
		for(Integer i : set) 
			if(!set1.contains(i))
				diff.add(i);
				
		for(Integer i : set1) 
			if(!set.contains(i))
				diff.add(i);
		
		return diff;
	}
}
