package sheet2;

public class Tanishk 
{
	public static String q25(double a, double b, double c, double d, double e) 
	{
		double percent = (a+b+c+d+e)/5;
		
		if (percent >= 60) {
			return "First Division with "+percent+"% marks";
		}
		else if (percent >= 50 && percent < 60) {
			return "Second Division with "+percent+"% marks";
		}
		else if (percent >= 40 && percent < 50) {
			return "Third Division with "+percent+"% marks";
		}
		else {
			return "Fail";
		}
	}
	
	public static String q26(char x, String gender, int age) {
		
	//	married = M, male = m, unmarried = U, female = f
		
		if (x == 'M') {
			return "Driver is eligible for insurance";
		}
		
		else if (x == 'U') {
			
			if ( gender == "male" &&  age > 30) {
				return "Driver is eligible for insurance";
			}
			else if (gender == "female" && age > 25) {
				return "Driver is eligible for insurance";
			}
		}
		else {
			return "Invalid";
		}
		return null;
	}
	
	
	public static int q27(char gen, int years, String qual) {
		int sal = 0;
		
		if (gen == 'm') {
			
			if (years >= 10) {
				
				if (qual == "graduate")
				{
					sal = 10000;
				}
				else {
					sal = 15000;
				}
				
			}
			else {
				
				if (qual == "graduate")
				{
					sal = 7000;
				}
				else {
					sal = 10000;
				}
				
			}
			
		}
		else if (gen == 'f') {
			
			if (years >= 10) {
				
				if (qual == "graduate")
				{
					sal = 9000;
				}
				else {
					sal = 12000;
				}
				
			}
			else {
				
				if (qual == "graduate")
				{
					sal = 6000;
				}
				else {
					sal = 10000;
				}
				
			}
			
		}
		else {
			sal = 0;
		}
		
		return sal;
	}
	
	
	public static double q22PerformanceA(int exp, int sal)
	{
		double finalsal = sal;
		
		if (exp < 5) {
			finalsal = sal;
		}
		
		else if (exp >= 5 && exp <= 10) {
			finalsal = (sal + sal*0.15);
		}
		else {
			finalsal = (sal + sal * 0.2);
		}
		
		return finalsal;
	}
		
		
	public static double q22PerformanceB(String rank, int sal) 
	{
		double finalsal = sal;
		
		if (rank == "junior") {
			finalsal = sal + (sal*0.08);
		}
		else if (rank == "senior") {
			finalsal = sal + (sal*0.12);
		}
		
		return finalsal;
	}

	
	public static double q24(int basicsal){
		
		double total = basicsal;
		
		if (basicsal < 1500) {
			return total + (basicsal* 0.1) + (basicsal* 0.9);
		}
		
		else {
			return total + (basicsal + 500) + (basicsal * 0.98);
		}
		
	}

	public static double q28(int amt) {
		
		if (amt < 500) {
			return amt;
		}
		
		else if (amt >= 500 && amt <= 1000) {
			return amt - (amt*0.05);
		}
		
		else if (amt > 1000 && amt <= 5000) {
			return amt - (amt * 0.10);
		}
		
		else {
			return amt - (amt*0.15);
		}
		
	}
	
	
	public static String q29(String health, int age) {
		
		if (health == "Good") {
			
			if (age < 30) {
				return "500";
			}
			else if (age >= 30 && age < 50) {
				return "1200";
			}
			else {
				return "3000";
			}
			
		}
		else if (health == "Poor") {
			
			if (age < 30) {
				return "1000";
			}
			else if (age >= 30 && age < 50) {
				return "2000";
			}
			else {
				return "Not Eligible for Insurance";
			}
			
		}
		return "Invalid";
		
	}
	
	public static String q30(int age, String day)
	{
		if (age < 5) {
			return "Free";
		}
		else if (day == "sat" || day == "sun") {
			
			if (age >= 5 && age <18) {
				return "1500";
			}
			else if (age >= 18 && age < 60) {
				return "2000";
			}
			else {
				return "750";
			}
		}
		else {
			
			if (age >= 5 && age <18) {
				return "1000";
			}
			else if (age >= 18 && age < 60) {
				return "1500";
			}
			else {
				return "Free";
			}
		}
	}
	
	public static double q21(int units)
	{
		double bill = 0;
		
		if (units <= 50) {
			 bill = units*0.50;
			
		}
		else if (units <= 150) {
			int a = units - 50;
			bill =  50*0.50 + a*0.75;
		}
		
		else if (units <= 250) {
			int b = units - 150;
			bill =  50*0.50 + 100*0.75 + b*1.20;
		}
		
		else {
			int c = units - 250;
			bill = 50*0.50 + 100*0.75 + 100*1.20 + c*1.50;
		}
		
		return bill + (bill * 0.2);
	}
	
	
	public static double q23(int km)
	{
		double price = 0;
		if (km <= 10) {
			price = km*11;
		}
		else if (km <= 90) {
			double a = km - 10;
			price = 10*11 + a*10;
		}
		else if (km >= 100) {
			double b = km - 100;
		 price =  10*11 + 90 * 10 + b *9;
		}
		return price;
			
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(q28(2000));
		
		System.out.println();
		
		System.out.println(q23(100));
		
		System.out.println();
		
		System.out.println(q21(300));
		
		System.out.println();
		
		System.out.println(q30(25, "sun"));
		
		System.out.println();
		
		System.out.println(q29("Good", 25));
		
		System.out.println();
		
		System.out.println(q26('M', "male", 28));
		
		System.out.println();
		
		System.out.println(q24(1200));
		
		System.out.println();
		
		System.out.println(q27('m', 15, "graduate"));
		
		System.out.println();
		
		System.out.println(q22PerformanceA(8, 50000));
		
		System.out.println();
		
		System.out.println(q22PerformanceB("junior", 20000));
		
		System.out.println();
		
		System.out.println(q25(70, 80, 65, 75, 90));

	}

}
