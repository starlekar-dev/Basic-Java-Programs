package string;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if(romanNumberValidation(input)) {
			System.out.println("Roman to Integer (Method 1) : " + romanToInteger2(input));
//			System.out.println("Roman to Integer (Method 2) : " + romanToInteger1("CXIV"));			
		}
		
		else
			System.out.println("Invalid Roman Number");
	}
	
	
	public static boolean romanNumberValidation(String s) {
		
		s = s.trim().toUpperCase();
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if( ch!='I' && ch!='V' && ch!='X' && ch!='L' && ch!='C' && ch!='D' && ch!='M')
				return false;
		}
		
		if(s.matches(".*(IIII|XXXX|CCCC|MMMM|VV|LL|DD).*"))
			return false;
		
		if(s.matches("II.*|.*VV.*|.*LL.*|.*DD.*|.*VX.*"))
			return false;

		return true;
	}

	
	public static int romanToInteger2(String s) {
		int result=0, currentValue=0, prevValue=0;
		
		for(int i=s.length()-1; i>=0; i--) {
			char currentSymbol = s.charAt(i);
			
			switch(currentSymbol) {
				case 'I': currentValue = 1; break;
				case 'V': currentValue = 5; break;
				case 'X': currentValue = 10; break;
				case 'L': currentValue = 50; break;
				case 'C': currentValue = 100; break;
				case 'D': currentValue = 500; break;
				case 'M': currentValue = 1000; break;
//				default : System.out.println("Invalid Character : " +currentSymbol);
			}
			
			if(currentValue < prevValue)
				result -= currentValue;
			else
				result += currentValue;
			prevValue = currentValue;
			
		}
		
		return result;
	}
	
	
	public static int romanToInteger1(String s) {
		int result = 0, prevValue = 0;
		HashMap<Character, Integer> romanValues = new HashMap<>();
		
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char currentSymbol = s.charAt(i);
			int currentValue = romanValues.get(currentSymbol);
			
			if (currentValue < prevValue)
				result -= currentValue;
			else
				result += currentValue;
			
			prevValue = currentValue;
			
		}
		
		return result;
	}
	
	
	
}


/*
Leet Code

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

*/
