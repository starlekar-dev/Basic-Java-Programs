package java_methods;
import java.util.Scanner;

public class Modulo {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		System.out.println(num+ " % 10 = " +num%10);
	}
}
