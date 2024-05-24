package array;

import java.util.Arrays;

public class ConsecutiveElements {

	public ConsecutiveElements() {
	}
	
	private static int[] longestSeq(int[] nums) {

		
		
		
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 4, 9 };
		int[] result = longestSeq(nums);

		System.out.println("Result = " +Arrays.toString(result));
	}
}


//Write a Java program to find the length of the longest consecutive elements sequence 
//from an unsorted array of integers.
//Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
//The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program 
//will return its length 5. 





/*
function findLongestConsecutiveSequence(arr):
    if arr is empty:
        return empty sequence
    
    # Sort the input array
    sort(arr)
    
    currentSequence = [arr[0]]  # Initialize the current sequence with the first element
    longestSequence = [arr[0]]  # Initialize the longest sequence with the first element
    
    for i from 1 to len(arr) - 1:
        # Check if the current element is consecutive to the last element in the current sequence
        if arr[i] == currentSequence[-1] + 1:
            currentSequence.append(arr[i])  # Add the current element to the current sequence
        else:
            # If not consecutive, check if the current sequence is longer than the longest sequence
            if len(currentSequence) > len(longestSequence):
                longestSequence = currentSequence  # Update the longest sequence
            
            currentSequence = [arr[i]]  # Start a new current sequence with the current element
    
    # Check if the last current sequence is longer than the longest sequence
    if len(currentSequence) > len(longestSequence):
        longestSequence = currentSequence
    
    return longestSequence
*/
