package array;

public class MergeArray {

	public MergeArray() {
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums1 = { 4, 5, 6, 7};

		int[] result = mergeArray(nums1, nums);
		for (int n : result)
			System.out.print(n + " ");

	}

	private static int[] mergeArray(int[] nums1, int[] nums) {
		int[] mergedArray = new int[nums.length + nums1.length];

		for (int i = 0; i < nums.length; i++) {
			mergedArray[i] = nums[i];
		}

		int counter = 0;

		for (int i = nums.length; i < nums1.length + nums.length; i++) {
			mergedArray[i] = nums1[counter];
			counter++;
		}

		return mergedArray;
	}

}
