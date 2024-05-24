package array;
//
//class Student implements Comparable<Student>{
//	private int rno;
//	private String name;
//	
//	Student(){
//		super();
//	}
//	
//	Student(int r, String n) {
//		this.rno = r;
//		this.name = n;
//	}
//	
//
//	@Override
//	public String toString() {
//		return "Student [rno=" + rno + ", name=" + name + "]";
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(this.rno, o.rno);
//		return this.name.compareTo(o.name);
//	}
//	
//	
//}



class Student implements Comparable{
	private int rno;
	private String name;
	
	Student(){
		super();
	}
	
	Student(int r, String n) {
		this.rno = r;
		this.name = n;
	}
	
	

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
	
		Student std = (Student) o;
		
		if(this.rno == std.rno)
			return 0;
		else if(this.rno > std.rno)
			return 1;
		else
			return -1;
	
	
	}
	
	
}
