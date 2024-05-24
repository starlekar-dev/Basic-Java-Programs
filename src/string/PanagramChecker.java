package string;

import java.util.Arrays;

public class PanagramChecker {

	public PanagramChecker() {
	}

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog”";

		if (isPanagram(s))
			System.out.println("It is a Panagram");
		else
			System.out.println("It is not a Panagram");
	}

	public static boolean isPanagram(String s) {

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		s = s.replaceAll(" ", "").toLowerCase();

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (chars[i] == s.charAt(j)) {
					chars[i] = ' ';
				}
			}
		}

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ')
				return false;
		}

		return true;
	}

}
