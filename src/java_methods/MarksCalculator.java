package java_methods;

import java.util.Scanner;

public class MarksCalculator {
	static Scanner scan = new Scanner(System.in);

	public static void totalMarks(int mathMarks, int scienceMarks, int marathiMarks, int historyMarks,
			int geographyMarks) {
		System.out.println(
				"\nTotal Marks = " + (mathMarks + scienceMarks + marathiMarks + historyMarks + geographyMarks));

	}

	public static void averageMarks(int mathMarks, int scienceMarks, int marathiMarks, int historyMarks,
			int geographyMarks) {
		System.out.println(
				"\nAverage Marks = " + ((mathMarks + scienceMarks + marathiMarks + historyMarks + geographyMarks) / 5));
	}

	public static void main(String args[]) {
		System.out.println("Maths : ");
		int mathMarks = scan.nextInt();

		System.out.println("Science : ");
		int scienceMarks = scan.nextInt();

		System.out.println("Marathi : ");
		int marathiMarks = scan.nextInt();

		System.out.println("History : ");
		int historyMarks = scan.nextInt();

		System.out.println("Geography : ");
		int geographyMarks = scan.nextInt();

		totalMarks(mathMarks, scienceMarks, marathiMarks, historyMarks, geographyMarks);
		averageMarks(mathMarks, scienceMarks, marathiMarks, historyMarks, geographyMarks);
	}
}
