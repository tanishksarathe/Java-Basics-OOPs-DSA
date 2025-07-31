package aggregation;

public class Main 
{

	public static void main(String[] args) 
	{
		College college1 = new College("NIIST");
		
		Student student1 = new Student("Tanishk",college1);
		
		System.out.println(student1.name);
		System.out.println(student1);
		
		System.out.println(college1.name);
	}

}

class College {
	
	String name;
	
	public College(String name) {
		this.name = name;
	}
	
}

class Student {
	
	String name;
	College address;
	
	public Student(String name, College address) {
		this.name = name;
		this.address = address;
	}
	
}