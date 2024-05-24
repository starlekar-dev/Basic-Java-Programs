package array;

import java.util.Arrays;

public class FrequencyCount {

	public static void main(String[] args) {

		countFrequency(new int[] {4, 6, 7, 3, 4, 6});
		
//								{4, 6, 7, 3 ,4, 6}
		
	}

	public static void countFrequency(int[] nums) {

		
		int[] freqCount = new int[nums.length];
		int flag = 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					nums[j] = flag;
				}
			}

			if (nums[i] != flag) {
				freqCount[i] = count;

			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				System.out.println(nums[i] + " " + freqCount[i]);
		}
		
		int[] arr = new int[1];
		System.out.println(arr[-1]);
		
	}

}
