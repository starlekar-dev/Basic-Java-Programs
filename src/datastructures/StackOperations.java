package datastructures;

public class StackOperations {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		for(int i=1; i<=10; i++)
			s.push(i);
		System.out.println(s);
		System.out.println(s.search(5));
		
	}

}


