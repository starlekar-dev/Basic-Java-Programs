package string;

public class StringEquality {

	public StringEquality() {
	}

	static boolean isEquals(String s1, String s2) {
		if(s1 == s2)
			return true;
		
		else
		{
			if (s1.length() == s2.length()) {
				for (int i = 0; i < s1.length(); i++) {
					if (s1.charAt(i) != s2.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "Sai";
		StringBuffer s2 = new StringBuffer("Sap");

		System.out.println(s1.contentEquals(s2));;		
//		System.out.println(isEquals(s1, s2));
	}

}
