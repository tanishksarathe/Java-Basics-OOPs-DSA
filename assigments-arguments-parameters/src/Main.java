
public class Main 
{
	
	public static float add(float a, float b) {
		
		return (a+b);
	}
	
	
	public static int subtraction(int a, int b) {
		
		return (a-b); 
	}
	
	public static int multiply(int a, int b) {
		
		return (a*b);
	}
	
	public static int division(int a, int b) {
		
		return (a/b);
	}
	
	public static int modulus(int a, int b) {
		
		return a%b;
	}
	
	public static int calculateTotalCricketBalls(int children, int balls) {
		
		return children*balls;
	}
	
	public static int calculateBooksPerShelf(int books, int shelves) {
		
		return (books/shelves);
	}
	
	public static int calculateCupcakesPerBox(int cupcake, int boxes) {
		
		return (cupcake/boxes);
	}
	
	public static int calculateTotalWorkers(int postoffices, int workers) {
		
		return (postoffices*workers);
	}
	
	
	public static int calculateTotalPizzaSlices(int member, int sliceeat) {
		
		return (member*sliceeat);
	}
	
	public static int calculateRequiredAirplanes(int passengers, int accommodate) {
		
		return (passengers/accommodate);
	}
	
	public static int calculateNumberOfForest(int trees, int oneforesttrees) {
		
		return (trees / oneforesttrees);
	}
	
	public static int calculateTotalNoteBooks(int students, int notebook) {
		
		return (students*notebook);
	}
	
	public static int calculateTotalMinutes(int hours , int minutes) {
		
		return (hours*minutes);
	}
	
	public static int calculateTotalKilometers(int trips, int distance) {
		
		return (trips*distance);
	}
	
	public static int calculateTotalChocolates(int nofbox, int ceb) {
		
		return (nofbox*ceb);
	}
	
	public static int calculateTotalScore(int nog, int spg) {
		
		return (nog*spg);
	}
	
	public static boolean isNumberOdd(int x) {
		
		if (x % 2 == 0) {
			
			return false;
			
		} else {
			
			return true;
		}
	}
	
	public static boolean isNumberEven (int x) {
		
		if (x % 2 == 0) {
			
			return true;
			
		} else {
			
			return false;

		}
	}
	
	public static boolean Compare(int x , int y) {
		
		if (x < y) {
			
			return true;
			
		} else {
			
			return false;

		}
	}
	
	public static boolean comapre1( int x , int y) {
		
		
		if (x == y) {
			
			return true;
			
		} else {
			
			return false;

		}
	}
	
	public static boolean compare2(int x, int y) {
		
		if (x >= y) {
			
			return true;
			
		} else {
			
			return false;

		}
	}
	
	public static boolean compare3(int x, int y) {
		
		if (x>y) {
			
			return true;
			
		} else {
			
			return false;

		}
	}
	
	public static int calculateDistance(int speed, int time ) {
		
		return (speed*time);
	}
	
	public static int calculateTime(int x, int y) {
		
		
		return ((x*60)/y);
	}
	
	
	public static int calculateSpeed(int distance, int time) {
		
		return (distance/time);
	}
	
	public static int calculateTravelTime(int dis, int speed) {
		
		return (dis/speed);
	}
	
	public static int calculateAverageSpeed(int dis , int time) {
		return (dis/time);
	}
	
	public static int calculateRelativeSpeed(int sp1, int sp2) {
		
		return (sp1 - sp2);
	}
	
	public static int calculateTimeTravel(int dis1, int sp1, int dis2, int sp2) {
		
		return (dis1/sp1) + (dis2 / sp2);
	}
	
	public static int calculateFuelEfficiency(int dis, int fuel) {
		
		return (dis/fuel);
	}
	
	public static int calculateAccelearation(int initial, int fin, int time ) {
		
		return (fin - initial) * 60/ time;
	}
	
	
	public static int calculateTripCost(int distance, int cpk) {
		
		return distance*cpk;
	}
	
	public static int calculateSimpleIntrest(int p, int r, int t) {
		
		int si = (p*r*t)/100;
		
		return si;
	}
	
	
	
	
	
	
	

	
	
	

	public static void main(String[] args) 
	{
	
		System.out.println(add(2.567f, 2.569f));
		
		System.out.println(subtraction(60, 50));
		
		System.out.println(multiply(5, 6));
		
		System.out.println(division(66, 22));
		
		System.out.println(calculateTotalCricketBalls(7,4));
		
		System.out.println(calculateBooksPerShelf(100,5));

		System.out.println(calculateCupcakesPerBox(27,3));
	
		System.out.println(calculateTotalWorkers(4, 10));
	
		System.out.println(calculateTotalPizzaSlices(5, 4));
	
		System.out.println(calculateRequiredAirplanes(180, 60));
	
		System.out.println(calculateNumberOfForest(42,6));
	
		System.out.println(calculateTotalNoteBooks(18, 5));
		
		System.out.println(calculateTotalMinutes(3, 60));
		
		System.out.println(calculateTotalKilometers(10, 15));
	
		System.out.println(calculateTotalChocolates(4,30));
	
		System.out.println(calculateTotalScore(5,40));
	
		System.out.println(isNumberOdd(7));
		
		System.out.println(isNumberEven(14));
	
		System.out.println(Compare(25, 30));
	
		System.out.println(comapre1(90, 90));
		
		System.out.println(compare2(89, 90));
		
		System.out.println(compare3(32, 15));
	
		System.out.println(calculateDistance(60, 4));
	
		System.out.println(calculateTime(90, 60));
	
		System.out.println(calculateSpeed(125, 5));
	
		System.out.println(calculateTravelTime(300, 100));
		
		System.out.println(calculateAverageSpeed(450, 9));
	
		System.out.println(calculateRelativeSpeed(80, 60));
		
		System.out.println(calculateTimeTravel(150, 50, 200, 100));
	
		System.out.println(calculateFuelEfficiency(600,40));
		
		System.out.println(calculateAccelearation(0, 60, 10));
		
		System.out.println(calculateTripCost(250, 50));
		
		System.out.println(calculateSimpleIntrest(1500, 4, 2));
		
		System.out.println(calculateSimpleIntrest(2000, 6, 5));
		
		System.out.println(calculateSimpleIntrest(800, 7, 3));
		
		System.out.println(calculateSimpleIntrest(3000, 5, 6));
		
		System.out.println(calculateSimpleIntrest(1500, 8, 7));
	}
	
	

}

