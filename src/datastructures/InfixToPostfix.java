package datastructures;

public class InfixToPostfix {

	public InfixToPostfix() {
		super();
	}
	
	
	public static void main(String[] args) {
		String s = "A+(B*C-(D/E-F)*G)*H";
		
		infixToPostfix(s);
		
	}


	public static void infixToPostfix(String s) {
		
		
		StackChar stack = new StackChar(s.length());
		
		for(int i=0; i<s.length(); i++) {
			char curChar = s.charAt(i);
			
			if(curChar >= 'A' && curChar <= 'Z')
				System.out.print(curChar);
			
			else {
				
				if(curChar == '+' && stack.peek() == '-')
					System.out.print(curChar);
				
				if(curChar == '+' && stack.peek() == ')') {
					System.out.print(curChar);
				}
				
				
				
//				stack.push(curChar);
			}
			
		}
		
		System.out.println(stack);
		
		
	}

}
