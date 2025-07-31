package conditionals;

public class Main
{
	
	public static void calculateProfitOrLoss(int cp, int sp) {
		
		int result = sp-cp;
		
		if (sp > cp) {
			System.out.print("Profit :" + result);
		
		}
		else {
			System.out.print("Loss :" + (-1 * result));
			
		}
		
		
	}
	
	
	public static String checkCharType (char x) {
		
		String g = "";
		
		if (x>=48 && x<=57) {
			g = ("Character is a digit");
		}
		
		else if (x>=0 && x<=32) {
			g = ("Character is a Control Character");
		}
		else if (x>=33 && x<=47 || x>=58 && x<=64 || x>=123 && x<=126 || x>=91 && x<=96 ) {
			g = ("Character is a Special Character");
		}
		else {
			g = ("Character is an Alphabet");
		}
		
		return g;
	}
	
	
	public static void checkVowelConsonent(char x) {
		
		if (x==65 || x==69 || x==73 || x==79 || x==85 ||
				x==117 || x==111 || x==105 || x==101 || x==97) {
			System.out.println("Character is a Vowel");
		}
		else {
			System.out.println("Character is a Consonent");
		}
		
	}
	
	// if you take decision from brain instead of heart
	
	public static double findMax(double a, double b) {
		
		double x;
		
		if (a>b) {
			x = a;
		}
		else {
			x = b;
		}
		return x;
		
	}
	
	public static String q2(double a, double b,double c)
	{
		
		String x = "";
		
		if (a>b && a>c) {
			
			x = (a + " is Greater");
			
		}
		else if(b>a && b>c) {
			
			x = (b + " is Greater");
			
		}
		else if (c>a && c>b){
			
			x = (c + " is Greater");
			
		}
		
		else if (a == b && b == c && c == a){
			
			x = ("All numbers are equal");
			
		}
		else {
			
			x = "Not a Number";
			
		}
		
		return x;
	}
	
	public static String q3(int rohan, int harsh, int anjali) {
		
		String x = "";
		
		if(rohan < harsh && rohan < anjali) {
			
			x = ("Rohan is youngest with an age of "+ rohan);
		}
		
		else if  (harsh < rohan && harsh < anjali)  {
		
			x = ("Harsh is youngest with an age of "+ harsh);
		}
		
		else if (anjali < rohan && anjali < harsh) {
		
			x = ("Anjali is youngest with an age of "+ anjali);
		}
		else {
			x = "All are equal";
		}
		return x;
			
	}
	
	public static String q4(int n) {
		
		String x = "";
		
		if (n > 0) {
			x = "Positive";
		}
		else if (n < 0) {
			x = "Negative";
		}
		else {
			x = "Zero";
		}
		
		return x;
	}
	
	public static boolean q5(int n) {
		
		if (n%5==0 && n%11==0) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static String q6(int x)
	{
		if(x%2==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
	
	
	public static String q9(char x) {
		
		String n = "";
		if (x >= 65 || x<= 90) {
			n = "UPPERCASE";
		}
		else if (x>=97 || x<=122) {
			n = "Lowercase";
		}
		else {
			n = "Not an Alphabet";
		}
		return n;
	}
	

	public static void main(String[] args) 
	{
		
		calculateProfitOrLoss(500,600);
		
		System.out.println();
		
		System.out.println(q6(50));
		
		System.out.println();
		
		System.out.println(q3(50,42,67));
		
		System.out.println();
		
		System.out.println(q4(0));
		
		System.out.println();
		
		calculateProfitOrLoss(500,400);
		
		System.out.println();
		
		checkCharType('a');
		
		System.out.println();
		
		checkCharType('0');
		
		System.out.println();
		
		System.out.println(checkCharType('%'));
		
		System.out.println();
		
		checkCharType(' ');
		
		System.out.println();
		
		checkVowelConsonent('a');
		
		System.out.println();
		
		checkVowelConsonent('p');
		
		System.out.println();
		
		System.out.println(findMax(-1, -6));
		
		System.out.println();
		
		System.out.println(q2(52, 52, 52));
		
		System.out.println(q5(8));
		

	}

}
