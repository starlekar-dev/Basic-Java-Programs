package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class SortKeys {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ccc", 44);
		map.put("qqq", 56);
		map.put("fff", 35);
		map.put("aaa", 66);
		System.out.println(map);
		
		sortKeys(map);
		sortValues(map);

	}

	public static void sortValues(HashMap<String, Integer> map) {
		
	}
	
	public static void sortKeys(HashMap<String, Integer> map) {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>(map);
		System.out.println(tree);
	}
}


class ValueComparator implements Comparator<SortKeys>{

	@Override
	public int compare(SortKeys o1, SortKeys o2) {
//		return Integer.compare(o1, o2);
		return 0;
	}
}

