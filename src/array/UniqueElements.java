package array;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {

	public UniqueElements() {}

	public static int[] findUniqueElements(int[] nums) {

		int[] uniqueElements = new int[nums.length];
		boolean isUnique = false;

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {

			int currentElement = nums[i];
			for (int j = 0; j < uniqueElements.length; j++) {
				if (currentElement != uniqueElements[j])
					isUnique = true;
				else {
					isUnique = false;
					break;
				}
			}
			if (isUnique)
				uniqueElements[counter++] = currentElement;
		}

		int[] result = new int[counter];
		for (int i = 0; i < counter; i++)
			result[i] = uniqueElements[i];

		return result;
	}

	public static void main(String[] args) {
//		int[] nums = { 1, 1, 2, 5, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
		int[] nums = {3, 5, 6, 3, 7, 5, 5, 3, 3};
//		[6, 7, 3, 5]
		
		int[] result = findUniqueElements(nums);
		for (int num : result)
			System.out.print(num + " ");
	}
}
