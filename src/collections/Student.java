package collections;

public final class Student {

	private int id;
	private String name;
	private int age;
	private String major;
	private String address;
	
	
	public Student() {
		this.id = 0;
		this.name = null;
		this.major = null;
		this.address = null;
		this.age = 0;
	}
	
	public Student(int id, String name, String major, String address, int age) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.address = address;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Id = " + id + ", Name = " + name + ", Major = " + major + ", Address = " +address;
	}
	
	
}
