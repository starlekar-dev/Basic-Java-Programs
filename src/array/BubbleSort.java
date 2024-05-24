package array;

public class BubbleSort {

	public BubbleSort() {}

	public static void main(String[] args) {
		int[] nums = { 10, 8, 20, 12, 5 };

		nums = bubbleSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

	public static int[] bubbleSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

}
