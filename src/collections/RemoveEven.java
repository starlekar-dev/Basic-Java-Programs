package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEven {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(20);
		list.add(33);
		list.add(17);
		list.add(10);
		System.out.println(list);
		System.out.println(removeEven(list));
		System.out.println(removeEven1(list));
		System.out.println(removeEven2(list));
	}

	public static List<Integer> removeEven(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next() % 2 == 0)
				itr.remove();
		}
		return list;
	}
	
	
	public static List<Integer> removeEven1(List<Integer> list){
		List<Integer> odd = new ArrayList<>();
		for(Integer i : list)
			if(i % 2 != 0)
				odd.add(i);
		return odd;
	}

	public static List<Integer> removeEven2(List<Integer> list){
		list.removeIf(number -> number%2 == 0);
		return list;
	}
}
