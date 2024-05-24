package array;

public class SumOfElements {

	public static void main(String[] args) {
		int[] nums = {50, 50, 20, -1};
		
		System.out.println(findSumOfArray(nums));
	}

	public static int findSumOfArray(int[] nums) {
		int sum = 0;
		for(int n : nums)
			sum += n;
		return sum;
	}

}
