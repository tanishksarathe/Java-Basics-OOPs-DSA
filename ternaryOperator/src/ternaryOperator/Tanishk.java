package ternaryOperator;

import java.security.KeyStore.TrustedCertificateEntry;

public class Tanishk {

	public static String q1(int n) {
		
		return (n == 1) ? "Monday" : 
			(n == 2)? "Tuesday" : 
				(n==3) ? "Wednesday" :
					(n==4) ? "Thrusday" : 
						(n==5) ? "Friday" : 
							(n==6) ? "saturday" :
								 "Sunday";
		
	}
	
	public static String q2(int n) {
		return (n ==1) ? "january" : 
			(n==2) ? "February" : 
				(n==3)? " March" : 
					(n==4) ? "April" :
						(n==5) ? " May" : 
							(n==6) ? "June" : 
								(n==7) ? "July": 
									(n==8) ? "August" :
										(n==9) ? "September":
											(n==10) ? "October" :
												(n==11) ? "November" : "December";
	}
	
	
	public static String q3(int hun, int five, int two) {
		
		int totalhundred = hun*100;
		int totalfive = five*500;
		int totalthousand = two*2000;
		
		return (totalfive + totalhundred + totalthousand <= 10000 ) ? "Amount is within Limit" : "Amount Exceeds the limit";
	}
	
	public static double q4(int q, int pp) {
		
		int total = q*pp;
		
		return (total > 100) ? total - (total*0.10) : total; 
		
	}
	
	
	public static boolean q5(int a, int b, int c) {
		
		return (a+b+c == 180) ? true : false;
	}
	
	public static boolean q6(int a, int b, int c) {
		
		return (a+b > c || b+c >a || a+c > b) ? true : false;
		
	}
	
	public static String q7(int a, int b, int c) {
		
		return (a == b || b ==c || c ==a ) ? "Isoceles Triangle" :
			(a == b && b== c && c==a) ? "Equiateral Triangle" : "Scalene triangle";
		
	}
	
	public static int q8(int join, int current, int sal) {
		
		int yos = current - join;
		
		return (yos > 3) ? (sal + 2500) : sal; 
		
	}
	
	
	public static String q9(int a, int b, int c, int d, int e) {
		
		int p = (a+b+c+d+e)/5;
		
	return	(p >= 90)? " Grade A " : 
			(p >= 80) ? "Grade B" : 
				(p >= 70) ? "Grade C":
					(p >= 60) ? "Grade D" :
						(p >= 40) ? " Grade E" : "Grade F";
		
	}
	
	public static double q10(int sal) {
		
		return (sal <= 10000) ? sal + sal*0.2 + sal *0.8 :
			(sal <= 20000) ? sal + sal*0.25 + sal* 0.9 :
				sal + sal*0.3 + sal*0.95;
				
		
	}
	
	
	
	public static void main(String[] args) 
	{
	
		System.out.println(q1(1));
		
		System.out.println();
		
		System.out.println(q2(5));
		
		System.out.println();
		
		System.out.println(q3(5, 8, 2));
		
		System.out.println();
		
		System.out.println(q4(150, 20));
		
		System.out.println();
		
		System.out.println(q5(90, 45, 45));
		
		System.out.println();
		
		System.out.println(q6(10, 15, 25));
		
		System.out.println();
		
		System.out.println(q7(6, 6, 8));
		
		System.out.println();
		
		System.out.println(q8(20, 25, 10000));
		
		System.out.println();
		
		System.out.println(q9(95, 80, 70, 60, 85));
		
		System.out.println();
		
		System.out.println(q10(8000));

	}

}
