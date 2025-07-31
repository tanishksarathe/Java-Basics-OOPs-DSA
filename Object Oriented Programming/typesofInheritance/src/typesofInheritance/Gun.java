package typesofInheritance;

public class Gun {
	
	int a;
	String name;
	int rpm;
	
	public Gun() {
	
	}
	
	public Gun(int a, String name) {
		this(a, name, 1400);
	}
	
	public Gun(int a, String name, int rpm) {
		
		this.a = a;
		this.name = name;
		this.rpm = rpm;
		
	}
	
	public void showdetails() {
		
		System.out.println(this.a + " " + this.name + " " + this.rpm);
	}
	
	
	
	public void gun() {
		System.out.println("I am a gun from Super class");
	}

	public static void main(String[] args) 
	{
		Gun objA = new Gun(47, "AK47");
		
		Sniper objB = new Sniper();
		
		Shotgun objC = new Shotgun();
		
		objA.showdetails();
		
//		objC.printnext();
		
//		objB.print();
		
		

	}

}

class Sniper extends Gun {
	
	public void gun() {
		System.out.println("I am a gun from sub class");
	}
	
	public void snipergun() {
		System.out.println("My range is maximum");
	}
	
	public void print() {
		super.gun();
	}
}

class Shotgun extends Sniper {
	
	public void gun() {
		System.out.println("I am a gun from sub-sub class");
	}
	
	public void shotgun() {
		System.out.println("My shot is absolute");
	}
	
	public void printnext() {
		super.gun();
	}
}


