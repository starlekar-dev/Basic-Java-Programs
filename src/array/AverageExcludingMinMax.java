package array;

public class AverageExcludingMinMax {

	public AverageExcludingMinMax() {
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 4, 9 };
		float result = averageExcludingMinMax(nums);

		System.out.println("Result = " + result);

	}

	public static float averageExcludingMinMax(int[] nums) {
		AdditionOfMinMax.bubbleSort(nums);
		int n = nums.length - 2;
		float sum = 0.0f;
		for (int i = 1; i < nums.length - 1; i++)
			sum += nums[i];
		return (sum / n);
	}

}
