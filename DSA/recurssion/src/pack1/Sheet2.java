package pack1;

import java.util.Scanner;

public class Sheet2 {
	
	/*
	 	Write a recursive function hcf() to find the HCF
(Highest Common Factor) or GCD (Greatest Common
Divisor) of two numbers.
	 */
	
		public static int hcf(int a, int b) {
			
			if (b == 0) return a;
			return hcf(b, a % b);
			
		}
		
		/*
		 	Write a recursive function lcm() to find the LCM (Least
Common Multiple) of two numbers.
		 */
		
		
		public static int lcm(int a, int b) {
			
			int max = Math.max(a, b);
			
			int prod = a*b;
			
			return isLcm(a,b,prod,0, max);
			
		}
		
		
		public static int isLcm(int a, int b, int prod, int res, int max) {
			
			if (prod < max) return res;
			
			else if (prod % a == 0 && prod % b == 0) {
				res = prod;
			}
			
			return isLcm(a,b, prod-1, res, max);
			
		}
		
		
		/*
		 	Write a recursive function sumOddNumbers() to find
the sum of the first N odd numbers.
		  
		 */
		
		public static int sumOddNumber(int n) {
			
			return helpSumOdd(n, 1, 0);
			
		}
		
		
		public static int helpSumOdd(int n,int count, int res) {		
			
			if ( count > n) {
				return res;
			}
			return helpSumOdd(n, count+1, res+(2*count-1));
			
		}
		
		
		
		/*
		 	Write a recursive function decimalToBinary() to
convert a decimal number to its binary equivalent.
		 */
		
		public static void decimalTobinary(int n) {
			
			if ( n == 0 ) return;
			
			decimalTobinary(n/2);
			System.out.print(n%2 + " ");
			
		}
		
		
		/*
		 		Write a recursive function nthTerm() to find the Nth
term of an arithmetic progression.
		 */
		
		
		public static int nthTerm(int a, int b, int c, int d,int x, int count) {
			
			if(b-a == c-b) {
				
				if (count >= x-2) return a+d;
			
			}	
			
			return nthTerm(a,b,c,d,x,count+1) + d;
		}
		
		
		public static int askNth() {
			
			Scanner objScanner = new Scanner(System.in);
			
			System.out.print("Enter first three terms of your AP : ");
			
			int a = objScanner.nextInt();
			System.out.print(" ");
			int b = objScanner.nextInt();
			System.out.print(" ");
			int c = objScanner.nextInt();
			
			
			if (b-a != c-b) {
				System.out.println("Enter a valid AP");
				return 0;
			}
			
			
			System.out.print("Enter What term you want : ");
			int x = objScanner.nextInt();
			
			int d = b-a;
			
			int res = nthTerm(a, b, c, d, x, 0);
			
			return res;
		}
		
		
		/*
		 	Write a recursive function reverseNumber()
that reverses the digits of a given integer number and
returns the reversed number.
		 */
		
		public static int helpCheckReverse(int n, int res) {
			
			if ( n == 0 ) return res;
			
			int digit = n%10;
			
			return helpCheckReverse(n/10, res*10 + digit);

		}
		
		
		public static int checkReverse(int n) {
			
			return helpCheckReverse(n,0);
						
		}
		
		
		/*
		 
	 	Write a recursive function isPalindrome() that
checks whether a given integer number is a
palindrome.

	 */
		
		
		public static boolean palindrome(int n) {
				
			int reverse = checkReverse(n);
			
			if (n == reverse) return true;
			else return false;
				
		}
		
		
		/*
		 		Write a recursive function isArmstrong() that
checks whether a given integer number is an
Armstrong number.
	
		 */
	
		public static int counter(int n) {
			
			if (n==0) return 0;
			
			return 1 + counter(n/10);
			
		}
		
		public static int isArmstrong(int sum, int digits, int i, int n) {
			
			if(i == 0) return sum;
			
			int a = n%10;
			
			return (int) Math.pow(a, digits) + isArmstrong(sum, digits, i-1, n/10);
			
		}
		
		
		public static void Armstrong(int n) {
			
			int d = counter(n);
			
			int res = isArmstrong(0, d, d, n);
			
			if ( res == n) {
				System.out.println("Armstrong Number");
			}
			else {
				System.out.println("Not an Armstrong Number");
			}
			
		}
		
		
		
		/*
		 		Write a recursive function perfect() to check
whether the given integer is a perfect number or not.
		
		 */
		
		
		public static void perfect(int n) {
			
			int res = perfect(n, n-1, 0);
			
			if (res == n) {
				System.out.println(n + " is a perfect number");
			}
			else {
				System.out.println(n + " is not a perfect number");
			}
			
		}
		
		
		public static int perfect(int n, int x, int res) {
			
			if (x == 0) return res;
			
			if (n % x == 0) {
				res = res + x;
			}
			
			return perfect(n, x-1, res);
	
		}
		
		/*
		 	Write a recursive function fibonacci() that
calculates the Fibonacci series up to the Nth term and
prints the sequence.
		 */
		
		
		public static void fibonacci(int n) {
			
			int a = 0;
			int b = 1;
			
			System.out.print(a + " ");
			System.out.print(b + " ");
			
			fibonacci(a, b, n-2, 0);
			
		}
		
		
		public static void fibonacci(int a, int b, int n, int count) {
			
			
			if (count >= n) return;
			
			int res = a+b;
			
			System.out.print(res + " ");
			fibonacci(b, res, n, count+1);
			
		}
		
		
		
	
	public static void main(String[] args) 
	{
		System.out.println(hcf(36, 60));
		
		System.out.println();
		
		System.out.println(lcm(4, 6));
		
		System.out.println();
		
		System.out.println(sumOddNumber(5));
		
		System.out.println();
		
		Armstrong(153);
		
		System.out.println(); 
		
		decimalTobinary(10);
		
		System.out.println();
		
		System.out.println(palindrome(12121));
		
		System.out.println();
		
		System.out.println(checkReverse(123));
		
		System.out.println();
		
		perfect(6);
		
		System.out.println();
		
		fibonacci(8);
		
		System.out.println();
		
		perfect(28);
		
		System.out.println();
		
		System.out.println(askNth());
		
	}

}
