package datastructures;

import java.util.Arrays;

public class Stack {

	
	private final int MAX;
	private int top;
	private int[] a;
	
	public Stack() {
		this(10);
	}
	
	public Stack(int size) {
		this.MAX = size;
		this.top = -1;
		this.a = new int[size];
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	
	boolean isFull() {
		return top == (MAX-1);
	}

	void clear() {
		top = -1;
	}
	
	int peek() {
		try {
			if (!isEmpty())
				return a[top];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element not Available.");
			return Integer.MAX_VALUE;
		}
	}
	
	int size() {
		return top+1;
	}
	
	void push(int x) {
		try {
			if (!isFull())
				a[++top] = x;
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " : Element cannot be Pushed.");
		}
	}
	
	int pop() {
		try {
			if (!isEmpty())
				return a[top--];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " : Element cannot be Popped.");
			return Integer.MAX_VALUE;
		}
	}
	
	public String toString() {
		int[] copy = Arrays.copyOf(a, top+1);
		return Arrays.toString(copy);
	}
	
	int search(int element) {
		int distance = 1;
		for(int i=top; i>=0; i--) {
			if (element == a[i])
				return distance;
			else
				distance++;
		}
		return -1;
	}
	
	public int[] toArray() {
		int[] copy = Arrays.copyOf(a, top+1);
		return copy;
	}
	
}
