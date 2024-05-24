package array;

import java.util.Arrays;

public class CommonElementsThreeArrays {

	public CommonElementsThreeArrays() {
	}

	public static void main(String[] args) {
		int[] array1 = {};
		int[] array2 = {};
		int[] array3 = {};

		int[] result = findCommonElements(array1, array2, array3);
		System.out.println("Common Elements : " + Arrays.toString(result));
	}

	public static int[] findCommonElements(int[] array1, int[] array2, int[] array3) {

		int commonElementsSize = array1.length < array2.length
				? (array1.length < array3.length ? array1.length : array3.length)
				: (array2.length < array3.length ? array2.length : array3.length);

		int[] commonElements = new int[commonElementsSize];
		
		int length = array1.length > array2.length
				? (array1.length > array3.length ? array1.length : array3.length)
				: (array2.length > array3.length ? array2.length : array3.length);
		

		return null;
	}

}
