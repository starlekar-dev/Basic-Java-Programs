package datastructures;

import java.util.Arrays;
import java.util.Scanner;

class StackExpression {

	final int MAX;
	int top;
	char[] chars;

	public StackExpression(int size) {
		this.MAX = size;
		this.top = -1;
		this.chars = new char[size];
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == (MAX - 1);
	}
	
	int size() {
		return top+1;
	}
	
	char peek() {
		try {
			if(!isEmpty())
				return chars[top];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ " : Element not Available.");
			return 0;
		}
	}
	
	void push(int ch) {
		try {
			if(!isFull())
				chars[++top] = (char) ch;
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ " : Element cannot be pushed.");
		}
	}
	
	char pop() {
		try {
			if(!isEmpty())
				return chars[top--];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ " : Element cannot be Popped. Exiting the Program");
			System.exit(MAX);
			return '\u0000';
		}
	}
	
}

public class PostfixExpression {

	public PostfixExpression() {
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Input : ");
		String expression = scan.nextLine();
		
		expression = expression.replaceAll(" ", "");
		
		System.out.println("Result = " +evaluatingExp(expression));
	}

	public static int evaluatingExp(String expression) {
		
		StackExpression s = new StackExpression(expression.length());
		int result = 0;
		for(int i=0; i<expression.length(); i++) {
			char currentChar = expression.charAt(i);
			
			if(currentChar >= '0'  && currentChar <= '9') {
				s.push(currentChar);
				System.out.println(Arrays.toString(s.chars));
			}
			
			else {
				int op2 = Character.getNumericValue(s.pop());
				int op1 = Character.getNumericValue(s.pop());
			
				switch(currentChar) {
				
				case '+': result += (op1 + op2);	
						  s.push(Character.forDigit(result, 10)); 
						  break;
				
				case '-': result += (op1 - op2);	
						  s.push(Character.forDigit(result, 10));	
						  break;
				
				case '*': result += (op1 * op2);	
						  s.push(Character.forDigit(result, 10));		
						  break;
						  
				case '/': if(op2!=0) {
								result += (op1/op2);
								s.push(Character.forDigit(result, 10));
						  }
						
						  else {
							  System.out.println("Divisor cannot be zero. Exiting Program.");
							  System.exit(0);
						  }
						  
						  break;
							  
				default : System.out.println("Unsupported Operand. Exiting Program.");
						  System.exit(0);
				
				}
				System.out.println(Arrays.toString(s.chars));
			}
		}
		
		
		return s.chars[0];
	}

}
