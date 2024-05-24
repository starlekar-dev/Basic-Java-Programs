package array;

import java.util.Arrays;
import java.util.Random;

public class ShufflingElements {

	public ShufflingElements() {
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Shuffled Array  : "+Arrays.toString(doShuffling(nums)));
	}

	public static int[] doShuffling(int[] arr) {

        Random rand = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
	}
}
