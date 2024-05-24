package array;

public class VarArgAddition {

	public VarArgAddition() {
	}

	public static void main(String[] args) {
		System.out.println(addition(1, 4, 5));
	}

	public static Integer addition(int... nums) {

		int result = 0;
		for(int i=0; i<nums.length; i++) 
			result += nums[i];
		return result;
	}

}
