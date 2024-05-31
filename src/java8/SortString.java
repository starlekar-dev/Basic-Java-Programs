package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {
		
        List<String> names = Arrays.asList("Sai", "Mayu", "Sakshi", "Soham");
        System.out.println(sortInAscending(names));
        System.out.println(sortInDescending(names));
        
	}

	
	public static List<String> sortInAscending(List<String> names){
		
//		return names.stream()
//	        	 .sorted((a, b) -> a.compareToIgnoreCase(b))
//	        	 .collect(Collectors.toList());
		
		return names.stream()
	        	 .sorted()
	        	 .collect(Collectors.toList());
	}
	
	public static List<String> sortInDescending(List<String> names){
//		return names.stream()
//				.sorted((a, b) -> b.compareToIgnoreCase(a))
//				.collect(Collectors.toList());
		
		return names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}
	
}
