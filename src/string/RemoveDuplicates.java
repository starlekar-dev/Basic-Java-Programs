package string;

import java.util.Arrays;

public class RemoveDuplicates {

	public RemoveDuplicates() {
	}

	public static void main(String[] args) {

		String s = "aabbcccccaaa";

		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {

		s = s.trim().replaceAll(" ", "");

		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					chars[j] = ' ';
				}
			}
		}

		
		StringBuffer sb = new StringBuffer("");
		System.out.println(sb.length());
		
		String res = new String(chars);
		res = res.replaceAll(" ", "");

		return res;
	}

}
