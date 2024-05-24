// Write a Java program to convert an array to an ArrayList.

package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	public ArrayToArrayList() {}

	public static void main(String[] args) {
		Integer[] numsArray = {1,2,3,4};
		
		
		List<Integer> numsList = toArrayList(numsArray);
		System.out.println(numsList.toString());
	}

	public static List<Integer> toArrayList(Integer[] numsArray) {

		List<Integer> convertedList = new ArrayList<>();
		for(int i=0; i<numsArray.length; i++) {
			convertedList.add(numsArray[i]);
		}
		
		
		return convertedList;
	}

}
