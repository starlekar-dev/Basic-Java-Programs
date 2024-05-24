package string;

import java.util.Arrays;

public class StringCompression {

	public StringCompression() {}

	public static void main(String[] args) {
		
		String s = "aaabbccdee";
		System.out.println("Compressed String : " +compressedString(s));
	}

	public static String compressedString(String s) {
		
		String res = new String("");
		String[] chars = s.toLowerCase().split("");
		System.out.println(Arrays.toString(chars));
		
		for(int i=0; i<chars.length; i++) {
			String currentChar = chars[i];
			
			if(!currentChar.isEmpty()) {
				int count = 1;
				for(int j = 0; j<chars.length; j++) {
					if(chars[i].equals(chars[j])) {
						count++;
					}
					else
						break;
				}
				res += count;
			}
			
		}
		
		return res;
	}

}
