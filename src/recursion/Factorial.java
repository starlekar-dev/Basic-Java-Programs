package recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 7;
		System.out.println(factWithoutRecursion(num));
		System.out.println(factWithRecursion(num));
	}

	public static int factWithRecursion(int num) {
		if(num == 0 || num == 1)
			return 1;
		else 
			return num * factWithRecursion(num-1);
	}

	public static int factWithoutRecursion(int num) {
		if(num == 0 || num == 1)
			return 1;
		else {
			int fact = 1;
			for(int i=1; i<=num;  i++)
				fact = fact * i;
			return fact;
		}
	}
}
