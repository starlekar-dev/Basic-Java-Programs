package array;

import java.util.Arrays;

public class MergeAndRemoveDuplicates {

	public MergeAndRemoveDuplicates() {
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 4, 5};

//		Method 1
		System.out.println(Arrays.toString(mergeUniqueElements1(arr1, arr2)));
		
//		Method 2
		System.out.println(Arrays.toString(mergeUniqueElements2(arr1, arr2)));

	}

	public static int[] mergeUniqueElements1(int[] arr1, int[] arr2) {

		int[] mergedArray = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

		boolean isUnique = false;
		int counter = 0;

		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++) {
				if (mergedArray[i] != mergedArray[j])
					isUnique = true;
				else {
					isUnique = false;
					break;
				}
			}

			if (isUnique)
				counter++;
		}

		int[] result = new int[counter];
		counter = 0;
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++) {
				if (mergedArray[i] != mergedArray[j])
					isUnique = true;
				else {
					isUnique = false;
					break;
				}
			}

			if (isUnique)
				result[counter++] = mergedArray[i];
		}

		return result;
	}
	
	
	
	public static int[] mergeUniqueElements2(int[] arr1, int[] arr2) {
		
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		int counter = arr1.length;
		boolean isUnique = false;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr2[i] != arr1[j])
					isUnique = true;
				else {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				mergedArray[counter] = arr2[i];
				counter++;
			}
		}
		
		int[] result = new int[counter];
		System.arraycopy(mergedArray, 0, result, 0, counter);
		return result;
	}
	
}
