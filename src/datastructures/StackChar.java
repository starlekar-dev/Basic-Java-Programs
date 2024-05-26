package datastructures;

import java.util.Arrays;

public class StackChar {

	private final int MAX;
	private int top;
	private char[] chars;
	private int mod_count = 0;

	
	StackChar(){
		this(10);
	}
	
	StackChar(int size) {
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
		return top + 1;
	}

	char peek() {
		try {
			if (!isEmpty())
				return chars[top];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element not Available.");
			return 0;
		}
	}

	void push(char ch) {
		try {
			if (!isFull()) {
				chars[++top] = ch;
				mod_count++;
			}
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Pushed.");
		}
	}

	char pop() {
		try {
			if (!isEmpty()) {
				mod_count--;
				char ch = chars[top];
				chars[top] = 0;
				return ch;
			}
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Popped. Exiting Program.");
			System.exit(MAX);
			return '\u0000';
		}
	}

	@Override
	public String toString() {
		
		char[] elements = Arrays.copyOf(chars, mod_count);
		String s = "";
		for(int i=0; i<elements.length; i++) {
			s += elements[i];
		}
		return s;
	}
	
	

}

