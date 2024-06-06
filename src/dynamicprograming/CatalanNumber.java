package dynamicprograming;

public class CatalanNumber {

	public static void main(String[] args) {

		int n = 10;
		System.out.println("Catalan number at " + n + " is : " + getCatalanNumber(n));
	}

	public static int getCatalanNumber(int n) {

		int res = 0;
		if (n <= 1)
			return 1;
		for (int i = 0; i < n; i++)
			res += getCatalanNumber(i) * getCatalanNumber(n - i - 1);
		return res;
	}
}
