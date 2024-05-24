package array;

public class FindElement {

	public FindElement() {
	}

	public static void main(String[] args) {
		int[] nums = {10, 20, 8, 7, 5};
		int key = 8;
		int result = findElement(nums, key);

		if(result >= 0)
			System.out.println(result);
		else
			System.out.println("Element Not Found");
		
	}

	public static Integer findElement(int[] nums, int key) {

//		sortArray(nums);
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == key) {
				return i+1;
			}
		}

		return -100;
	}

	public static void sortArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

}
