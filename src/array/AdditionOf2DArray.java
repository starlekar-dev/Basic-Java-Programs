package array;

public class AdditionOf2DArray {

	public AdditionOf2DArray() {
	}

	public static void main(String[] args) {

		int[][] nums1 = { { 0, 0, 0 }, { 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3 } };
		int[][] nums2 = { { 0, 0, 0 }, { 1, 1, 1 }, { 2, 2 }, { 3, 3 } };
		int[][] result = doAddition(nums1, nums2);

		for (int[] i : result) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static int[][] doAddition(int[][] nums1, int[][] nums2) {
		int rowsOfNums1 = nums1.length;
		int rowsOfNums2 = nums2.length;

		int columnOfNums1 = 0, columnOfNums2 = 0;
		for (int i = 0; i < rowsOfNums1; i++) {
			int column = nums1[i].length;
			if (columnOfNums1 < column)
				columnOfNums1 = column;
		}

		for (int i = 0; i < rowsOfNums2; i++) {
			int column = nums2[i].length;
			if (columnOfNums2 < column)
				columnOfNums2 = column;
		}

		int row = (rowsOfNums1 > rowsOfNums2) ? rowsOfNums1 : rowsOfNums2;
		int column = (columnOfNums1 > columnOfNums2) ? columnOfNums1 : columnOfNums2;
		int[][] result = new int[row][column];

		try {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if ((j >= nums1[i].length) && (j >= nums2[i].length))
						result[i][j] = 0 + 0;

					else if (j >= nums2[i].length)
						result[i][j] = nums1[i][j];

					else if (j >= nums1[i].length)
						result[i][j] = nums2[i][j];

					else
						result[i][j] = nums1[i][j] + nums2[i][j];

				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		return result;
	}
}
