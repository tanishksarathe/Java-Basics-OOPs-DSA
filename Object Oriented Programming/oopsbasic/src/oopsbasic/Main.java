package oopsbasic;

public class Main {
	
	int age;
	String name;
	
	public Main(int age, String name) 
	{
		this.age = age; //non static 
		this.name = name;
	}

	public static void main(String[] args)
	{
		Main tanishk=  new Main(22, "Tanishk");
		
		System.out.println(tanishk.age + tanishk.name);
		
		A aryan = new A(20, "Aryan", 6266631539l);
		A lakshya = new A(21, "Lakshya", 987654321l);
		A love = new A(25,"Love", 9876543431l);
		
		System.out.println(aryan.age + " " + aryan.name + " " + aryan.mobno);
		System.out.println(lakshya.age + " " + lakshya.name + " " + lakshya.mobno);
		System.out.println(love.age + " " + love.name + " " + love.mobno);
		

	}

}

class A{
	
	int age;
	String name;
	long mobno;
	
	public A(int a, String b, long c){
		age = a;
		name = b;
		mobno = c;
	}
	
}
