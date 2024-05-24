package array;

import java.util.Arrays;
import java.util.Comparator;





public class ArraysSortingMethods {

	public ArraysSortingMethods() {}


	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Sai");
		Student s2 = new Student(40, "Sanju");
		Student s3 = new Student(30, "Sakshi");
		Student s4 = new Student(20, "Sharad");
		
		Student[] stud = {s1, s2, s3, s4};
		Integer[] nums = {10, 20,  8, 0b111, 0x1F, 077};
		
		
//		1) Sorting Array using Arrays.sort();
//		sortArray(nums);
		
//		Sorting Array of Objects using Arrays.sort();
		sortStudentArray(stud);
		
		
		Arrays.sort(nums, Comparator.reverseOrder());
		
		
//		2) Binary Search
		
	}

	
	/**
	 * @param Array of int
	 * input  : {10, 20,  8, 0b111, 0x1F, 077}
	 * output : {7, 8, 10, 20, 31, 63}
	 */
	public static void sortArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));		
	}

	
	
	
	
	
	/**
	 * @param Array of Students
	 * 
	 * To sort array of object types, we need to implement comparable to that 
	 * particular class. After implementing Comparable<{@value classname} we
	 * need to override compare method. If for example if we try to sort students 
	 * array basis on its rno, then while overriding  we must write 
	 * 
	 * 
	 * 1) return Integer.compare(this.rno, o.rno);
	 * 
	 * input : 
	 *  Student s1 = new Student(10, "Sai");
		Student s2 = new Student(40, "Sanju");
		Student s3 = new Student(30, "Sakshi");
		Student s4 = new Student(20, "Sharad");
		
		Student[] stud = {s1, s2, s3, s4};
		
		
		output : Student [rno=10, name=Sai], Student [rno=20, name=Sharad], 
				 Student [rno=30, name=Sakshi], Student [rno=40, name=Sanju]]
				 
	 * 
	 * 
	 * 2) 
	 * 
		
	 */
	
	public static void sortStudentArray(Student[] stud) {
		System.out.println(Arrays.toString(stud));
		Arrays.sort(stud);
		System.out.println(Arrays.toString(stud));
	}
	
	
	
}
