package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 3;
		fibonacciWithoutRecursion(num);
		
	
	}

	public static void fibonacciWithoutRecursion(int num) {

		int j=0;
		int k=1;
		if (num == 0)
			System.out.println(0);
		else if (num == 1)
			System.out.println(1);
		else {
			int sum = 0;
			for(int i=0; i<num; i++) {
				sum = j + k;
				j = k;
				k = sum;
				System.out.print(k+ " ");
			}
		}
			
		
	}

}
