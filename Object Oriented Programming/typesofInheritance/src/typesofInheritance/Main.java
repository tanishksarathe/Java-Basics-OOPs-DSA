package typesofInheritance;

public class Main {

	public void shape() {
		System.out.println("I am public method Shape");
	}
	
	public static void main(String[] args) 
	{
		Formula objA = new Formula();
		
		objA.square();
		objA.shape();
		objA.formula();
	}

}

class Circle extends Main {
	
	public void circles() {
		System.out.println("I am a circle");
	}
	
}

class Square extends Main {
	
	public void square() {
		System.out.println("I am a square");
	}
}

class Formula extends Square {
	
	public void formula() {
		System.out.println("Formula for square is Side*Side ");
	}
}