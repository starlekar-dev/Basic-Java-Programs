//	 Question: Write a method which will accepts a array of marks and it will return the grade in string format

package array;
import java.util.Scanner;

public class GradeDecider {
	private static Scanner scan = new Scanner(System.in);
	
	public GradeDecider() {}

	public static String gradeCalculator(float[] marks) {
		float sum=0.0f;
		for(int i=0; i<marks.length; i++) 
			sum += marks[i];
		
		float average = sum/marks.length;	
		System.out.println(average);
		if(average >=35 && average <= 50)
			return "D Grade";
		
		else if(average >50 && average <= 70)
			return "C Grade";
		
		else if(average >70 && average <= 90)
			return "B Grade";

		else if(average >90 && average <= 100)
			return "A Grade";
	
		else
			return "Fail";
	}
	
	public static void main(String[] args) {
		System.out.println("Total Subjects : ");
		int subjects = scan.nextInt();
		
		float[] marks = new float[subjects];
		
		System.out.println("\nEnter marks for each Subject :");
		try {
			for(int i=0; i<subjects; i++) {
				System.out.println("Subject["+(i+1)+"] : ");
				float mark = scan.nextFloat();
				if (mark<0 || mark>100)
					throw new IllegalArgumentException("Marks must be between 0 to 100.");
				else
					marks[i] = mark;
			}
		}
		catch(Exception e) {
			System.err.println("Invalid Input : " +e.getMessage());
			scannerClose();
			System.exit(1);
		}
		
		System.out.println("The Student got "+gradeCalculator(marks));
		
		scannerClose();
	}

	private static void scannerClose() {
		scan.close();
	}
}
