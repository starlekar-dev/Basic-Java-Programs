package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TOH(4, 'A', 'B', 'C');
	}

	public static void TOH(int n, char src, char aux, char dest) {
		if(n == 1) {
			System.out.println(src+ " -> " +dest);
			return;
		}
		TOH(n-1, src, dest, aux);
		TOH(1, src, aux, dest);
		TOH(n-1, aux, src, dest);
	}
}
