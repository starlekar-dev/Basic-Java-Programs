package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEvenOdd {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 2, 5, 6, 8, 10);
		
		System.out.println(countEvenOdd(new ArrayList<>(nums)));
		System.out.println(arrangeEvenOdd(new ArrayList<>(nums)));
	}
	public static Map<String, List<Integer>> arrangeEvenOdd(List<Integer> nums) {
		
		Map<String, List<Integer>> list = new HashMap<>();
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		for(Integer num : nums) 
			if(num % 2 == 0)
				even.add(num);
			else
				odd.add(num);
		list.put("Even", even);
		list.put("Odd", odd);
		return list;
	}
	public static HashMap<String, Integer> countEvenOdd(List<Integer> nums) {
		
		HashMap<String, Integer> count = new HashMap<>();
		for(Integer num : nums) 
			if(num % 2 == 0)
				if(count.containsKey("Even")) 
					count.put("Even", count.get("Even")+1);
				else
					count.put("Even", 1);
			else
				if(count.containsKey("Odd")) 
					count.put("Odd", count.get("Odd")+1);
				else
					count.put("Odd", 1);
		return count;
	}

}
