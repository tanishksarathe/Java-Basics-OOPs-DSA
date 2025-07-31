package package1;

import package2.C;
import package2.D;


public class Main {
	
	static int age = 4;
	static public String name = "Tanishk";
	static protected char a = '*';
	static private String n = "Sanjana";
	
	void methodone() {
		System.out.println("I am default method from main (same) class");
	}
	
	protected void methodtwo() {
		System.out.println("I am protected method from main (same) class");
	}
	
	private void methodthree() {
		
		System.out.println("I am private method from main (same) class");
	}
	
	public void person() {
		System.out.println("I am public method from main (same) class");
	}

	public static void main(String[] args)
	{
		
		// same package same class
		
		
		Main objMain = new Main(); 
		
		System.out.println(Main.age);
		System.out.println(Main.n);
		System.out.println(Main.a);
		System.out.println(Main.name);
		
		objMain.methodone();
		objMain.methodtwo();
		objMain.methodthree();
		objMain.person();
		
		
		// same package subclass
		
		A.print();
		
		// same package non subclass
		
		B.print();
		
		// different package subclass
		
		C.print();
		
		// different package non subclass
		
		D.print();
		

		
	}

}

class A extends Main {
	
	// same package subclass
	
	public static void print() {

		A objA = new A(); 
 	
		// static
		
		System.out.println(A.age);
		System.out.println(A.name);
		System.out.println(A.a);
		
		// non static 
		
		objA.methodone();
		objA.methodtwo();
		objA.person();
		
//		 objA.methodthree();   private not accessible
		
	}
}
