package composition;

public class Home {
	
	public Home() {
		
		Room objRoom1 = new Room("Bedroom");
		Room objRoom2 = new Room("Kitchen");
		Room objRoom3 = new Room("Drawing Room");
		Room objRoom4 = new Room("Living Room");
		
		System.out.println(objRoom1.name);
		System.out.println(objRoom2.name);
		System.out.println(objRoom3.name);
		System.out.println(objRoom4.name);
		
	}

	public static void main(String[] args) 
	{
		Home objHome = new Home();
		
		

	}

}

