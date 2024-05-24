package array;

public class AdditionOfDiagonalElements {

	public AdditionOfDiagonalElements() {
	}

	public static void main(String[] args) {
		int[][] nums = {{1, 1, 1, 1},
						 {2, 2, 2, 2},
						 {3, 3, 3, 3},
						 {4, 4, 4, 4}};
		
		int row = nums.length;
		int column = nums[0].length;
		
		int majorDiagonal = 0, minorDiagonal = 0; 
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(i == j)
					majorDiagonal += nums[i][j];
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=column-1; j>=0;) {
				minorDiagonal += nums[i][j];
				break;
			}
		}
		
		System.out.println("Sum of Major Diagonal : "+majorDiagonal);
		System.out.println("Sum of Minor Diagonal : "+minorDiagonal);
		
	}

}
