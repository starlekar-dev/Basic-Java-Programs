package array;

import java.util.Comparator;

public class IdComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {

		return (p1.getId() == p2.getId()) ? 0 : (p1.getId() > p2.getId()) ? 1 : -1;
		
	}

}
