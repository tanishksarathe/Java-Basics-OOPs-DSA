package ternaryOperator;

public class Sheet3

{
	public static double q1(int units) {
		
		double bill = 0;
		bill =  (units <= 50) ? units*0.50 : 
			
			(units <= 150) ?
					
					50*0.50 + (units - 50) *0.75 :
						
						(units <= 250) ?
								50*0.50 + 100*0.75 + (units - 100)*1.20 :
									50*0.50 + 100*0.75 + 100*1.20 + (units - 250)*1.50;
		
		return bill + bill*0.20;
		
		
	}
	
	public static double q2 (char per, int sal, String level, int yos)
	{
		return ( per == 'A' &&  yos > 10) ? sal + sal*0.20 :
			(per == 'A' && (yos >= 5 && yos <= 10) ) ? sal + sal*0.15 :
				(per == 'B' && level == "senior") ? sal + sal*0.12 :
					(per == 'B' && level == "junior") ? sal + sal*0.8 :
						sal;
					
		
	}
	
	public static double q3(int km) {
		
		return (km <= 10) ? km * 11 : 
			(km <= 90) ? 10*11 + (km - 10)*10 : 
				10*11 + (90 -10)*10 + (km - 90) * 9; 
 		
	}
	
	public static double q4(int sal) {
		
		return (sal < 1500) ? sal + sal*0.10 + sal*0.90 : sal + sal*0.98 + 500; 
		
	}
	public static String q5(int a, int b, int c, int d, int e) {
		
		int per = (a+b+c+d+e) / 5;
		
		return (per >= 60) ? "First division" + per :
			(per >= 50 &&  per <= 59) ? "Second Division" + per : 
				(per >= 40 && per <50) ? "Third Division " + per : "Fail";
	}
	
	public static boolean q6(String marital, int age, char gen ) {
		
		return (marital == "married" || marital == "unmarried" && gen == 'M' && age > 30 || marital == "unmarried" && gen == 'F' && age > 25) ? 
			true : false;
			
		}
	
	public static double q7(int yos, char gen, String qual) {
		
		return (yos >= 10 && qual == "Post-Graduate" && gen == 'M' ) ? 15000 :
			(yos >= 10 && qual == "Graduate" && gen == 'M') ? 10000 :
				(yos < 10 && gen == 'M' && qual == "Post-Graduate") ? 10000 :
					(yos < 10 && gen == 'M' && qual == "Graduate") ? 7000 :
						(yos >=10 && gen == 'F' && qual == "Post-Graduate") ? 12000 :
							(yos >= 10 && gen == 'F' && qual==" Graduate") ? 9000 :
								(yos < 10 && qual == "Post-Graduate" && gen == 'F') ? 10000 : 6000;
	}
	
	public static double q8 (int amt) {
		
		return (amt < 500) ? amt :
			(amt >=500 && amt <= 1000) ? amt - amt*0.05 :
				(amt > 1000 && amt <= 5000) ? amt - amt*0.10 :  amt - amt*0.15;
		
	}
	
	public static String q9 (int age, String health) {
		
		return (age < 30 && health == "Good") ? "500" :
			(age < 30 && health == "Poor") ? "1000" :
				(age >= 30 && age< 50) ? "1200" :
					(age >= 30 && age < 50) ? "2000" :
						(age >=50 && health == "Good") ? "3000" :
							"Not eligible for insurance";
		
	}
	
	public static int q10 (int age, String day) {
		
		return (age < 5) ? 0 : 
			(age >= 5 && age < 18 && (day == "sat" || day == "sun")) ? 1500 :
				(age >= 5 && age < 18 && (day != "sat" || day != "sun")) ? 1000 :
					(age >= 18 && age < 60 && (day == "sat" || day == "sun")) ? 2000 :
						(age >= 18 && age < 60 && (day != "sat" || day != "sun")) ? 1500 :
							(age >= 60 && (day == "sat" | day == "sun")) ? 750 : 0;  
		
	}

	public static void main(String[] args)
	{
		System.out.println(q10(25, "sun"));
		
		System.out.println();
		
		System.out.println(q9(25, "Good"));
		
		System.out.println();
		
		System.out.println(q8(500));
		
		System.out.println();
		
		System.out.println(q7(12, 'M', "Graduate"));
		
		System.out.println();
		
		System.out.println(q6("married", 28, 'M'));
		
		System.out.println();
		
		System.out.println(q5(90, 90, 90, 99, 85));
		
		System.out.println();
		
		System.out.println(q4(1200));
		
		System.out.println();
		
		System.out.println(q3(100));
		
		System.out.println();
		
		System.out.println(q2('A', 50000, "senior", 8));
		
		System.out.println();
		
		System.out.println(q1(500));
	}

}
