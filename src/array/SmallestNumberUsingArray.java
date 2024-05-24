package array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestNumberUsingArray {

	static void findSmallest(List<Integer> numbers) {

		if (numbers.isEmpty()) {
			System.out.println("No numbers were entered.");
			return;
		}

		Map<Integer, Integer> smallestElements = new HashMap<>();
		int min = numbers.get(0);
		smallestElements.put(1, min);
		for (int i = 1; i < numbers.size(); i++) {
			int currentNumber = numbers.get(i);
			if (currentNumber < min) {
				min = currentNumber;
				smallestElements.clear();
				smallestElements.put(i + 1, currentNumber);
			} else if (currentNumber == min)
				smallestElements.put(i + 1, currentNumber);
		}

		System.out.println("Smallest Number : ");
		for (Map.Entry<Integer, Integer> entry : smallestElements.entrySet()) {
			System.out.println("Index(" + entry.getKey() + ") : value(" + entry.getValue()+")");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		System.out.println("Enter Numbers(Press any Non-Integer to exit) : \n");

		while (scan.hasNextInt())
			numbers.add(scan.nextInt());

		findSmallest(numbers);
	}
}
