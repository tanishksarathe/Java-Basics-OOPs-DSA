package conditionals;

public class Misc {

	public static void q1(int sal, int years) {
		
		if (sal > 50000 && years > 5) {
			
			if(years <= 5) {
				
				System.out.println(sal + sal*0.07);
				return;
			}
			
			System.out.println(sal + sal/10);
						
		}
		
		else if( sal <= 50000 && years > 5) {
			
			if(years <= 5) {
				System.out.println(sal+sal*0.03);
				return;
			}
			
			System.out.println(sal + sal*0.05);
		}
		
		
		
	}
	
	
	public static void q2(int age, int exp) {
		
		if (age > 30 && exp > 10) {
			
			if (exp <= 10) {
				
				System.out.println("Experienced");
				return;
			}
			
			System.out.println("Veteran");
		}
		
		else if (age <= 30 && exp > 5) {
				
			if(exp <= 5) {
				System.out.println("Novice");
				return;
			}
			
			System.out.println("Young Experienced");
			
		}
		
		
	}
	
	
	public static void q3(int sal, int exp) {
		
		if (sal > 40000 && exp > 3) {
			
			if (exp <= 3) {
				
				System.out.println("Eligible with co-signer");
				return;
			}
			
			System.out.println("Eligible");
		}
		
		else {
			System.out.println("Not Eligible");
		}
		
	}
	
	
	public static void q4(int n) {
		
		for (int i =1; i <= 10; i++)
		{
			System.out.println(n*i);
		}
		
	}
	
	
	public static int q5() {
		
		int sum = 0;
		
		int i =1;
		while (i <= 100) 
		{
		
			 sum = sum + i;
			 i++;
			
		}
		
		return sum;
		
	}
	
	
	public static void q7(String des) 
	{
		switch (des) 
		{
		case "Manager":
		
			System.out.println("$" + (90000+90000*0.25));
		
			break;
			
		case "Developer" :
			
			System.out.println("$" +(70000+70000*0.20));
			break;
			
		case "Tester" : 
			
			System.out.println("$" + (55000 + 55000*0.15));
			break;
			
		case "Intern" :
			
			System.out.println("$" + (40000 + 40000*0.10));
			break;
		default:
			break;
		}
	}
	
	
	public static void q8(String type) {
		
		switch(type) {
		
		case "Breakfast" : 
			
			System.out.println("Breakfast : " + 100);
			break;
			
		case "Lunch" : 
			
			System.out.println("Lunch : "+ 200);
			break;
		
		case "Dinner" :
			System.out.println("Dinner : "+ 250);
			break;
			
			default :
				break;
			
		}
		
	}
	
	
	public static String q9(int n) {
		
	  return (n > 0) ? "Positive" :
		   (n == 0) ? "Zero" : "Negative";
		
	}
	
	public static String q10(int age) {
		
		return (age >= 18) ? "Eligible to vote" : "Not Eligible";
		
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println(q10(20));
		
		System.out.println();
		
		System.out.println(q9(-5));
		
		System.out.println();
		
		q8("Dinner");
		
		System.out.println();
		
		q7("Manager");
		
		System.out.println();
		
		System.out.println(q5());
		
		System.out.println();
		
		q4(6);
		
		System.out.println();
		
		q3(30000, 5);
		
		System.out.println();
		
		q2(45, 15);
		
		System.out.println();
		
		q1(60000, 6);
		

	}

}
