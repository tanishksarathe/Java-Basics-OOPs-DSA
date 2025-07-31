package sheet2;

public class Main 
{
	public static String q11(int n)
	{
		String x = "";
			
		if(n == 1) {
			x = "Monday";
		}
		else if (n== 2) {
			x= "Tuesday";
		}
		else if(n == 3){
			x = "Wednesday";
		}
		else if(n== 4) {
			x = "Thursday";
		}
		else if(n == 5) {
			x= "Friday";
		}
		else if (n == 6) {
			 x = "Saturday";
		}
		else if(n == 7) {
			x = "Sunday";
		}
		else {
			x = "Not a valid day";
		}
		
		return x;
	}
	
	
	public static String q12(int n)
	{
		String x = "";
		
		if(n == 1) {
			x = "January";
		}
			
		else if(n== 2) {
			x = "February";
		}
			
		else if(n == 3) {
			x = "March";
		}
			
		else if (n== 4) {
			x = "April";
		}
			
		else if(n == 5) {
			x = "May";
		}
			
		else if(n == 6) {
			x = "June";
		}
			
		else if(n == 7) {
			x = "July";
		}
		else if (n == 8) {
			x = "August";
		}
		
		else if(n==9) {
			x = "September";
		}
			
		else if(n == 10) {
			x = "October";
		}
			
		else if(n == 11) {
			x = "November";
		}
			
		else if(n == 12) {
			x = "December";
		}

		else {
			x = "Not a day";
		}
		
		return x;
	}
	
	
	public static String q13(int hundred, int fivehund, int twothou) {
		
		String x = ""; 		
		int tothun = 100 * hundred;
		int tott = 2000 * twothou;
		int totfiv = 500 * fivehund;
		
		if ((totfiv + tothun + tott)>10000) {
			x = "Amount exceed 10,000";
		}
		else {
			x = "Amount is within limit";
		}
		return x;
	}
	
	public static int q14(int ppi, int q) {
		
		int final_price = ppi * q;
		
		if (q > 100) {
			return (final_price - (final_price*10/100));
		}
		else {
			return final_price;
		}
		
	}
	
	
	public static boolean q15(int a, int ng, int le) {
		
		if ((a + ng + le) == 180) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static boolean q16(int a, int b, int c) {
		
		if (a+b > c || b+c > a || a+c > b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static String q17(int a, int b, int c) {
		
		if ( a == b && b==c) {
			return "Equilateral Triangle";
		}
		
		else if ((a==b && a!=c) || (a==c && a!=b) || (c==b && b!=a)) {
			return "Isosceles Triangle";
		}
		
		else {
			return "Scalene Triangle";
		}
		
	}
	
	
	public static int q18(int current, int join) {
		
		int service = current - join;
		
		if (service > 3) {
			return 2500;
		}
		else {
			return 0;
		}
	}
	
	public static String q19(int a, int b, int c, int d, int e) {
		
		int percent = ((a+b+c+d+e)/5);
		
		if (percent >= 90) {
			return "Grade A";
		}
		else if ( percent >= 80 && percent < 90) {
			return "Grade B";
		}
		else if ( percent >= 70 && percent < 80) {
			return "Grade C";
		}
		else if ( percent >= 60 && percent < 70) {
			return "Grade D";
		}
		else if (percent >= 40 && percent < 60) {
			return "Grade E";
		}
		else if (percent < 40) {
			return "Grade F";
		}
		return null;
	}
	
	
	public static int q20(int basic){
		
		int total = basic;
		
		if (basic <= 10000) {
			return total + (basic * 20/100) + (basic * 80/100);
		}
		
		else if (basic <= 20000 && basic > 10000) {
			return total + (basic * 25/100) + (basic * 90/100);
		}
		else {
			return total + (basic * 30/100) + (basic * 95/100);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
	
		System.out.println(q11(4));
		
		System.out.println();
		
		System.out.println(q12(12));
		
		System.out.println();
		
		System.out.println(q13(5, 8, 2));
		
		System.out.println();
		
		System.out.println(q14(20, 150));
		
		System.out.println();
		
		System.out.println(q15(20, 60, 100));
		
		System.out.println();
		
		System.out.println(q20(8000));
		
		System.out.println();
		
		System.out.println(q19(95, 85, 90, 80, 88));
		
		System.out.println();
		
		System.out.println(q18(2024,2018));
		
		System.out.println();
		
		System.out.println(q17(5,6,8));
		
		System.out.println();
		
		System.out.println(q16(10,15,25));
		
	}

}
