package package1;


public class B 
{
	// same package non sub class
	
	public static void print() {
		
		Main a = new Main();
		
		// non static
		
		a.methodone(); // default
		a.methodtwo(); //protected 
		a.person(); // public access
		
//		a.methodthree();  private non accessible
		
		// static  
		
		System.out.println(Main.age);	// default 
		System.out.println(Main.a);			// protected
		System.out.println(Main.name);		// public
		
		// System.out.println(Main.n); Private NA
		
	}
	
}
