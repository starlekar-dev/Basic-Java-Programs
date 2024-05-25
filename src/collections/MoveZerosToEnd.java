package collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(scan.hasNextInt())
			list.add(scan.nextInt());
		
		System.out.println(list);
		
		ListIterator<Integer> ltr = list.listIterator();
		int count = 0;
		while(ltr.hasNext()) {
			Integer i = ltr.next();
			if(i == 0) {
				
			}
				
		}
		
		
	}

}
