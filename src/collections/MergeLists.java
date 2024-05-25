package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		Collections.sort(list);
		System.out.println(list);
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(20);
		list1.add(33);
		list1.add(17);
		list1.add(10);
		Collections.sort(list1);
		System.out.println(list1);
		
		System.out.println(mergeLists(list, list1));
	}

	public static List<Integer> mergeLists(List<Integer> list, List<Integer> list1) {
		list.addAll(list1);
		Collections.sort(list);
		return list;
	}

}
