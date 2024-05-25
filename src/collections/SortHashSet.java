//	Write a program to sort HashMap by keys
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortHashSet {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Sai", "Java", "Airoli", 24);
		Student s2 = new Student(7, "Sakshi", "Java", "Malad", 60);
		Student s3 = new Student(5, "Soham", "Python", "Airoli", 18);
		Student s4 = new Student(2, "Juee", "SQL", "Mumbai", 28);
		Student s5 = new Student(6, "Mayuri", "R", "Airoli", 22);
		Student s6 = new Student(9, "Kartik", "Python", "Malad", 30);
		Student s7 = new Student(10, "Rhushi", "Java", "Ghatkopar", 26);
		Student s8 = new Student(3, "Teju", "HTML", "Pune", 38);
		Student s9 = new Student(8, "Pranu", "CSS", "Panvel", 35);
		Student s10 = new Student(4, "Adi", "HTML", "Pune", 40);
		
		Map<Integer, Student> students = new HashMap<>();
		students.put(s1.getId(), s1);
		students.put(s2.getId(), s2);
		students.put(s3.getId(), s3);
		students.put(s4.getId(), s4);
		students.put(s5.getId(), s5);
		students.put(s6.getId(), s6);
		students.put(s7.getId(), s7);
		students.put(s8.getId(), s8);
		students.put(s9.getId(), s9);
		students.put(s10.getId(), s10);
		
		
//		Print students name who are learning Java
		System.out.println("Students with major in Java are : " +searchMajor(students, "java"));
		
//		Print students name whose age is below 25
		System.out.println("Students below age 25 are : " +filterAge(students, 25));
		
//		Print student details who stay in Malad and Airoli
		System.out.println("Students who stay in Malad and Airoli are : \n" 
				+filterAddress(students, "Malad", "Airoli"));
		
	}

	
	public static List<Student> filterAddress(Map<Integer, Student> students, String add1, String add2) {
		List<Student> filterAdd = new ArrayList<Student>();
		Collection<Student> studentData = students.values();
		
		for(Student s : studentData) {
			if(s.getAddress().equalsIgnoreCase(add1) || s.getAddress().equals(add2))
				filterAdd.add(s);
		}
		System.out.println(filterAdd.size());
		return filterAdd;
	}


	public static List<String> filterAge(Map<Integer, Student> students, int age){
		List<String> studentAge = new ArrayList<>();
		Collection<Student> studentData = students.values(); 
		for(Student s : studentData)
			if (s.getAge() <= age)
				studentAge.add(s.getName());
		return studentAge;
	}
	
	
	public static List<String> searchMajor(Map<Integer, Student> students, String lang) {
		
		List<String> studentLang = new ArrayList<>();
		Collection<Student> studentData = students.values(); 
		for(Student s : studentData)
			if (s.getMajor().equalsIgnoreCase(lang))
				studentLang.add(s.getName());
		return studentLang;
	}

}
