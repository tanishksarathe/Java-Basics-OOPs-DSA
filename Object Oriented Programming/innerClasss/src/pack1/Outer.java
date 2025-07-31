package pack1;

public class Outer {
	
	int x = 89;
	
	public void outer() {
		
//		local class because present inside a method
		
		class A
		{
//			int a = 5;
			
			public void print() {
				System.out.println(" I am a local method because i am present class > method > class > method");
			}
		}
		
		
		
		A objA = new A();
		
		objA.print();
		
		
		
		System.out.println("I am Outer class method");
	}
	
	

	 class Joy{
		int x = 90;
		
		public void inner() {
			System.out.println("I am inner class method");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Outer objOuter = new Outer();
		
//		Joy oJoy = new Joy(); // if inner class static
		 
		Joy oJoy = objOuter.new Joy(); 
		
		oJoy.inner();
		
		objOuter.outer();
		

	}

}
