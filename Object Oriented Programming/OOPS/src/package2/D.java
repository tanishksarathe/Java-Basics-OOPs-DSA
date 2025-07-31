package package2;

import package1.Main;

public class D 
{
	public static void print() {
		
		Main c = new Main();
		
		c.person(); // public
		
	//  c.methodone();  // default NA
	//  c.methodtwo(); // protected NA
	//	c.methodthree();  // private NA
		
		// static 
		
		//	System.out.println(Main.age);	// default NA 
		// System.out.println(Main.n); 			Private NA
		// System.out.println(Main.a);			// protected NA
		
		System.out.println(Main.name);		// public
		
	}
	
	
}
