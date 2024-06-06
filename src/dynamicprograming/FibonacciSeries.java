package dynamicprograming;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
			System.out.print(fibonacci(i) + " ");
	}

//	0, 1, 1, 2, 3, 5, 8
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
