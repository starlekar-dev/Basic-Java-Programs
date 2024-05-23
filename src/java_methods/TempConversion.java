package java_methods;
import java.util.Scanner;


public class TempConversion {
	
	public void Conversion(float far) {
		float cel = ((far - 32) * 5/9);
		System.out.println(far+ " degree in Farenheit is equal to " +cel+ " degree in Celsius.");
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		TempConversion obj = new TempConversion();
		
		System.out.println("Enter Temperature in Farenheit : ");
		float temp = scan.nextFloat();
		obj.Conversion(temp);
		
		scan.close();
	}
}
