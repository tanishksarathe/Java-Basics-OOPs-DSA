package whileloop;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Main
{

	public static void q1(int x)
	{
		int i = 0;
		while (i < x) {
			System.out.print("* ");
			i++;
		}
		
	}
	
	public static void q2(int x) {
		
		int i = 0;
		while (i<x) {
			System.out.println("*");
			i++;
		}
	}
	
	public static void q3(int x) {
		int i =0;
		while (i < x) {
			
			int j =0;
			while (j < x+1) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
	
	
	public static void q4(int n) {
		
		int i =0;
		while (i < n) {
			
			int j =0;
			while (j < n) {
				
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	
	public static void q5(int n) {
		
		int i =0;
		while (i < n) {
			
			int j=0;
			while (j <=i) {
				
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}
	
	
	public static void q6(int x) {
		
		int i =0;
		while (i < x) {
			
			int j = 0;
			while (j < x-i) {
				
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		
	}
	
	
	public static void q7(int n) {
		
		int i =0;
		while (i < n) {
			
			int j =0;
			while (j< i ) {
				
				
				System.out.print("  ");
				j++;
			}
			
			
			int k =0;
			while (k < n-i) {
				
				
				
				System.out.print("* ");
				k++;
			}
			
			System.out.println();
			i++;
		}
		
	}
	
	
	public static void q8(int n) {
		int i =0;
		while ( i < n) {
			
			int j =0;
			while (j < n-i-1) {
				
				System.out.print("  ");
				j++;
			}
			
			int k = 0;
			while (k <= i) {
				
				System.out.print("* ");
				k++;
			}
				
			System.out.println();
			i++;
		}
	}
	
	
	public static void q9(int n) {
		
		int i = 0;
		while (i < n) { 
			
			int j =0;
			while ( j < n-1-i) {
				
				System.out.print("  ");
				j++;
			}
			
			int k =0;
			while (k <= i-1) {
				System.out.print("* ");
				k++;
			}
			
			int l =0;
			while ( l <=i ) {
				
				System.out.print("* ");
				l++;
			}
			
			System.out.println();
			i++;
		}
	}
	
	
	public static void q10(int n)
	{
		int i =0;
		while (i< n) {
			
			int j = 0;
			while (j < i) {
				
				System.out.print("  ");
				j++;
			}
			
			int k=0;
			while (k < n-i) {
				
				System.out.print("* ");
				k++;
			}
			
			int l=0;
			while (l < n-1-i) {
				
				System.out.print("* ");
				l++;
			}
			
			System.out.println();
			i++;
		}
	}
	
	public static void main(String[] args) 
	{
		q8(5);
		
		System.out.println();
		
		q9(5);
		
		System.out.println();
		
		q10(5);
		
		System.out.println();
		
		q1(5);
		
		System.out.println();
		
		q2(5);
		
		System.out.println();
		
		q3(5);
		
		System.out.println();
		
		q4(4);
		
		System.out.println();
		
		q5(5);
		
		System.out.println();
		
		q6(5);
		
		System.out.println();
		
		q7(5);
	}

}
