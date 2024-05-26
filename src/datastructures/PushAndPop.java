package datastructures;

public class PushAndPop {

	public PushAndPop() {}

	public static void main(String[] args) {

		
		Stack s = new Stack(5);
		System.out.println(s.peek());		
		System.out.println(s.isEmpty());		
		System.out.println(s.isFull());
		
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push(30);

		System.out.println(s.peek());		
	}

}
