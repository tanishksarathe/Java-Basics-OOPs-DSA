package package2;

import package1.Main;

public class C extends Main 
{
	// different package subclass
	
	public static void print() {
		
		C b = new C();
		
		// non static 
		
		b.person(); // public
		b.methodtwo(); // protected
		
		// b.methodone();   default NA
		// b.methodthree();  private NA
		
		// static 
		
		//	System.out.println(Main.age);	// default NA 
		// System.out.println(Main.n); 			Private NA
		
		System.out.println(Main.a);			// protected
		System.out.println(Main.name);		// public
	}
}

class E {
	public void print() {
		System.out.println(" I am person E from package 2 ");
	}
}