package ternaryOperator;

public class Main 
{
	
	public static double q1(double a, double b) {
		
		return (a>b) ? a : b;
		
	}
	
	public static double q2(int a, int b, int c) {
		
	return (a>b && a>c) ? a : 
			(b>a && b>c) ? b : c;
		
	}
	
	public static String q3(int age1, int age2, int age3)
	{
	return	(age1 > age2 && age1 > age3) ? "Rohan is bigger with age of " +age1 : 
			(age2 > age1 && age2 > age3) ? "Harsh is bigger with an age of "+ age2 : "Anjali is bigger with an age of "+age3;
	}
	
	public static String q4(int n) {
		return (n > 0) ? "Positive" : 
			(n < 0) ? "Negative" : "Number is ZERO";
	}
	
	public static boolean q5(int n) {
		return (n %5 == 0 && n%11 == 0) ? true : false;
		
	}
	
	public static String q6(int n) {
		return (n %2 == 0) ? "Even" : "Odd";
	}
	
	
	public static String q7(char x) {
		return (x >= 47 && x < 58) ? "Digit" :
			(x >= 65 && x <= 90 || x>= 97 && x <=127) ? "Alphabet" : "Special character";
	}
	
	public static String q8(char x) {
		return (x == 97 || x == 65 || x== 101 || x ==105 || x == 111 || x == 117 || x== 69 || x == 73 || x ==79 || x==85) ? "Its a vowel" : "Its a Consonent";
		
	}
	
	
	public static String q9(char c) {
		return (c >= 65 && c <= 90) ? "Upper Case" : 
			(c >= 97 && c <= 127) ? "Lower case " : "Not an Alphabet";
	}
	
	
	public static String q10(int cp,int sp) {
		
		int price = sp - cp;
		 return (cp > price) ? "Loss" + ((price)) : "Profit"+ (price);
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(q1(15.5, 20.2));
		
		System.out.println();
		
		System.out.println(q2(10, 20, 15));
		
		System.out.println();
		
		System.out.println(q3(25, 30, 22));
		
		System.out.println();
		
		System.out.println(q4(5));
		
		System.out.println();
		
		System.out.println(q5(55));
		
		System.out.println();
		
		System.out.println(q6(4));
		
		System.out.println();
		
		System.out.println(q7('8'));
		
		System.out.println();
		
		System.out.println(q8('a'));
		
		System.out.println();
		
		System.out.println(q9('A'));
		
		System.out.println();
		
		System.out.println(q10(5000, 6000));

	}

}
