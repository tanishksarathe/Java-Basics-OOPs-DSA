package pack1;

import java.util.Scanner;

public class Main 
{
	
	/*
	 		Write a recursive function printIncreasing() that
prints numbers from 1 to n in increasing order.
	 */
	
	
	public static void printIncreasing(int x)
	{
		if(x==0) return;
		
		printIncreasing(x-1);	
		System.out.print(x + " ");

	}
	
	
	/*
	 	Write a recursive function printDecreasing()
that prints numbers from n to 1 in decreasing order
	 */
	
	
	public static void printDecreasing(int x) 
	{
		if(x==0) return;
		
		System.out.print(x + " ");
		printDecreasing(x-1);
		
	}
	
	/*
	 	Write a recursive function
IncreasingDecreasing() that prints numbers from 1 to n
in increasing order and then from n to 1 in decreasing
order.
	 */
	
	public static void increasingDecreasing(int x) {
		
		increasingDecreasing(1, x);
		
	}
	
	
	public static void increasingDecreasing(int x, int n)
	{
		
		if (x > n) return;

	    System.out.print(x + " ");            
	    increasingDecreasing(x + 1, n);       
	    System.out.print(x + " "); 

		
	}
	
	
	/*
	 	Write a recursive function findRangeSum() that
calculates and returns the sum of all integers between
number1 and number2 (inclusive).
	 */
	
	public static int findRangeSum(int x, int y) 
	{
		if (x == y) return x;
		
		return findRangeSum(x+1, y) + x;
	}
	
	
	
	/*
	   	Write a recursive function findSum() that
calculates and returns the sum of the first n natural
numbers.
	 */
	
	public static int naturalSum(int x) {
		
		if(x == 0) {
			return 0;
		}
			
		return naturalSum(x-1) + x;
	}
	
	
	/*
	 	 Write a recursive function power() that
calculates and returns the result of number raised to
the given power.
	 */
	
	
	public static int power(int x, int y)
	{
		if (y == 1) {
			return x;
		}
		
		return power(x, y-1) * x;
	}

	
	
	/*
	 		Write a recursive function factorial() that
calculates and returns the factorial of a given integer
number
	 */
	
	

	public static int factorial(int x)
	{
		
		if (x == 0) {
			return 1; 
		}
		
		return factorial(x-1)*x;
		
	}
	
	
	
	/*
	 		 Write a recursive function strong() that check
whether the given integer is a strong number or not.
	 */
	
	
	public static int strong(int n)
	{
		if (n==0) return 0;
		
		return strong(n/10) + factorial(n%10);
	}
	
	
	/*
	 	Write a recursive function sumOfDigits() that
calculates and returns the sum of the digits of a given
integer number.
	 */
	
	
	 public static int sumOfDigits(int x) 
	{
		if(x == 0) {
			return 0;
		}
		
		return sumOfDigits(x/10)+(x%10);
		
	}
	 
	 
	 
	 /*
	  		Write a recursive function isPrime() that
determines whether a given integer number (greater
than 0) is a prime number.

	  */
	 
		public static boolean primeCondition(int x, int i)
		{
			if ( i == x ) return true;
			
			if (x % i == 0) return false;
			
			return primeCondition(x, i+1);
		}
		
		public static String isPrime(int x) 
		{
			if (x <= 1) return "Not Prime";
			
			else if (primeCondition(x, 2)) {
				return "Prime";
			}
			
			return "Not Prime";
			
		}
	 
		
		/*
		 	Write a recursive function count() to count
the number of digits in a given positive integer.
		 */
		

	public static int count(int x)
	{
		if (x==0) {
			return 0;
		}
		
		return count(x/10) + 1; 
	}
	


	
	public static void main(String[] args)
	{
		Scanner objScanner = new Scanner(System.in);	
		
		System.out.println();
		
		printIncreasing(5);
		
		System.out.println();
		
		printDecreasing(5);
		
		System.out.println();
		
		increasingDecreasing(3);
		
		System.out.println();
		
		System.out.println(naturalSum(5));
		
		System.out.println();
		
		System.out.println(factorial(5));
		
		System.out.println();
		
		System.out.println(findRangeSum(3,7));
		
		System.out.println();
		
		System.out.println(power(3, 4));
		
		System.out.println();
		
		System.out.println(count(1789));
		
		System.out.println();
		
		System.out.println(sumOfDigits(1234));
		
		System.out.println();
		
		System.out.println(isPrime(5));
		
		System.out.println();
		
		System.out.print("Enter value to check if Strong or not : ");
		int a = objScanner.nextInt();
		
		if (a == strong(a)) {
			System.out.println("Strong");
		}
		else {
			System.out.println("Not Strong");
		}
		
		
		
	}
}















