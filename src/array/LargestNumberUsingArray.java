package array;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestNumberUsingArray {

	static void largestNumber(List<Integer> numbers) {
		
		Map<Integer, Integer> largestElements = new HashMap<>();
		
		int largest = numbers.get(0);
		largestElements.put(0, numbers.get(0));
		
		for(int i=1; i<numbers.size(); i++) {
			Integer currentNumber = numbers.get(i);
			if(currentNumber > largest) {
				largest = currentNumber;
				largestElements.clear();
				largestElements.put(i+1, currentNumber);
			}
			else if(currentNumber == largest) {
				largestElements.put(i+1, currentNumber);
			}
		}
		

		
		for(Map.Entry<Integer, Integer> entry : largestElements.entrySet())
			System.out.println("Largest Number is " +entry.getValue()+ " at position "+entry.getKey());
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers (Press any Non-Integer to exit) : ");
		List<Integer> numbers = new ArrayList<>();

		while (scan.hasNextInt())
			numbers.add(scan.nextInt());

		largestNumber(numbers);
		scan.close();
	}
}
