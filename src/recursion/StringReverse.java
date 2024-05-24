package recursion;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Sai";
		
		long startTime = System.nanoTime();
		System.out.println(withoutRecursion(s));
		long endTime = System.nanoTime();
		long elapsedTime = (endTime - startTime); 
        System.out.println("Time taken: " + elapsedTime + " nanoseconds");
		
        
        
        
        long startTime1 = System.nanoTime();
        System.out.println(withRecursion(s));
        long endTime1 = System.nanoTime();
		long elapsedTime1 = (endTime1 - startTime1); 
        System.out.println("Time taken: " + elapsedTime1 + " nanoseconds");
				
				
				
	}
	
	public static String withoutRecursion(String s) {
		char[] chars = s.toCharArray();
		
		int i = 0;
		int j = s.length()-1;
		while(i <= j) {
			char temp = chars[j];
			chars[j] = chars[i];
			chars[i] = temp;
			
			i++; j--;
		}
		
		return new String(chars);
	}

	
	public static String withRecursion(String s) {
		if(s.isEmpty() || s.length() == 1)
			return s;
		
		return withRecursion(s.substring(1)) + s.charAt(0);
	}
}
