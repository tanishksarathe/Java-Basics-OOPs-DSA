package loop2;

public class Main
{
	
	public static void q11(int n) {
		
		
		for (int i =0; i<n; i++) 
		{
			
			for (int space = 0; space < (n-i-1); space ++)
			{
				
				System.out.print("  ");
			}
			
			for (int star = 0; star <=i; star ++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		int m=4;
		
		for (int k=0; k < m; k++)
		{
			for (int j=0; j<k+1 ; j++ )
			{
				System.out.print("  ");
				
			}
			
			for (int stars= 0; stars < (m-k); stars++ ) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
			
			

	}
	
	
	
	public static void q13(int x) {
		
		for (int i=0; i <x; i++) 
		{
			
			for (int spaces =0; spaces <i; spaces++)
			{
				
				System.out.print("  ");
			}
			
			for (int stars=0; stars<x-i; stars++)
			{
				
				System.out.print("* ");
			}
 			
			System.out.println();
		}
		
		for (int i=0; i < (x-1); i++) {
			
			for (int u=0; u<(x-2-i);u++) {
				
				System.out.print("  ");
			}
			
			for (int y=0; y<(i+2); y++) {
				
				System.out.print("* ");
			}

			System.out.println();
		}
		
		
	}
	
	
	
	public static void q12 (int n) {
		
		for (int i = 0; i < n; i++) 
		{
			
			for (int star = 0; star <= i; star++ )
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		int y = (n-1);
		
		for (int j = 0; j<y; j++)
		{

			for (int x=0; x < y-j; x++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void q15 (int n) {
		
		for (int i = 0; i<n; i++) 
		{
		
			for (int space=0; space < i; space ++)
			{
				System.out.print("  ");
			}
			
			for (int y =0; y < n-i; y++)
			{
				System.out.print("* ");
			}
		
			for (int star = 0; star < n-i; star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
				
		
		
		for (int i = 0; i<n ; i++) {
			
			for (int space = 0; space <(n-i-1); space++)
			{
				System.out.print("  ");
			}
			
			for (int star = 0; star <= i; star++)
			{
				System.out.print("* ");
			}
			
			for (int k=0; k<=i ; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void q16(int n) {
		
		for (int i =0; i< n; i++)
		{
			
		for (int star = 0; star <(n-i); star ++) {
			System.out.print("* ");
		}
		
		for (int space= 0; space <i; space++) {
			System.out.print("  ");
		}
		
		for (int j = 0; j<i; j++) {
			System.out.print("  ");
		}
		
		for (int x=0; x<(n-i); x++) {
			System.out.print("* ");
		}
		
		System.out.println();
		}
		
	}
	
	
	public static void q17(int n) {
		
		for (int i=0; i<n; i++)
		{
			for (int spaces=0; spaces < (n-i-1); spaces++) {
				System.out.print("  ");
			}
			
			for (int star=0; star <= i; star++) {
				System.out.print("* ");
			}
			
			for (int k = 1; k<=i; k++) {
				System.out.print("* ");
			}			
			System.out.println();
		}

		
		for (int i = 0; i < n-1;i++) 
		{
			for (int space=0; space<=i; space++) {
				System.out.print("  ");
			}
			
			for (int star=0 ; star<(n-1-i); star++) {
				System.out.print("* ");
			}
			
			for (int j =0; j < n-2-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	public static void q18(int n) {
		
		for (int i = 0; i < n; i++) 
		{
			
			for (int star =0; star<=i; star++) 
			{
				
				System.out.print("* ");
				
			}
			
			for (int space = 0; space < (n-i-1); space++)
			{
				
				System.out.print("  ");
			}
			
			for (int spaces = 0 ; spaces < n-1-i; spaces++)
			{
				System.out.print("  ");
			}
			
			for (int stars=0; stars <=i; stars++) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		for (int i =0; i < n-1; i++)
		{
			for (int j=0; j < (n-1-i); j++)
			{
				
				System.out.print("* ");
			}
			
			for (int spaces=0; spaces<=(i); spaces++ ) {
				
				System.out.print("  ");
			}
			
			for (int k=0; k <=i; k++) {
				
				System.out.print("  ");
			}
			
			for (int star=0; star <(n-1-i); star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void q19(int n) {
		
		for (int i=0; i< n; i++) 
		{
			
			for (int star=0; star<=(n-i-1); star++ )
			{
				System.out.print("* ");
			}
			
			for (int space=0; space<i; space++)
			{
				System.out.print("  ");
			}
			
			for (int spaces=0; spaces <i; spaces++) {
				
				System.out.print("  ");
			}
			
			for (int stars = 0; stars<(n-i); stars++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i =0; i < (n-1); i++) 
		{
			for (int star=0; star<(i+2);star++) {
				
				System.out.print("* ");
			}
			
			for (int space=0; space<(n-2-i); space++) {
				
				System.out.print("  ");
			}
			
			for (int w=0; w<(n-2-i); w++ ) {
				
				System.out.print("  ");
			}
			
			for (int stars=0; stars<(i+2); stars++ ) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q20(int n) {
		
		for (int i=0;i<n;i++)
		{
			for (int space=0; space < i; space++) {
				
				System.out.print("  ");
			}
			
			for (int j=0; j<=(n-1-i); j++) {
				
				System.out.print("* ");
			}
			
			for (int star=0; star < (n-1-i); star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i =0; i < (n-1); i++) {
			
			for (int space=0; space < (n-2-i); space++) {
				
				System.out.print("  ");
			}
			
			for (int x=0; x<(i+2); x++) {
				
				System.out.print("* ");
			}
			
			for (int star=0; star <= i; star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void q21(int n) {
		
		for (int y =0; y<n; y++) {
			
			for (int spaces=0; spaces < (n-y-1); spaces++) {
				System.out.print("  ");
			}
			
			for (int star=0; star <= y; star++) {
				System.out.print("* ");
			}
			
			for (int k = 1; k<=y; k++) {
				System.out.print("* ");
			}
			
			for (int s =0; s<(n-1-y); s++) {
				
				System.out.print("  ");
			}
			
			for (int spa=0; spa < (n-y-1); spa++) {
				System.out.print("  ");
			}
			
			for (int st=0; st <= y; st++) {
				System.out.print("* ");
			}
			
			for (int g = 1; g<=y; g++) {
				System.out.print("* ");
			}	
				
			System.out.println();
		}

		for (int i = 0; i < n-1;i++) 
		{
			for (int space=0; space<=i; space++) {
				System.out.print("  ");
			}
			
			for (int star=0 ; star<(n-1-i); star++) {
				System.out.print("* ");
			}
			
			for (int j =0; j < n-2-i; j++) {
				System.out.print("* ");
			}
			
			for (int s=0; s<(i+1); s++) {
				
				System.out.print("  ");
			}
			
			for (int spa=0; spa<=i; spa++) {
				System.out.print("  ");
			}
			
			for (int st=0 ; st<(n-1-i); st++) {
				System.out.print("* ");
			}
			
			for (int j =0; j < n-2-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void q22(int n) {
		
		for (int x = 0; x < n; x++)
		{
			
			for (int star = 0; star <(n-x); star ++)
			{
				System.out.print("* ");
			}
			
			for (int space= 0; space <x; space++)
			{
				System.out.print("  ");
			}
			
			for (int j = 0; j<x; j++) 
			{
				System.out.print("  ");
			}
			
			for (int r=0; r<(n-x); r++) 
			{
				System.out.print("* ");
			}
			
			
			for (int stars = 0; stars <(n-x); stars ++)
			{
				System.out.print("* ");
			}
			
			for (int spaces= 0; spaces <x; spaces++)
			{
				System.out.print("  ");
			}
			
			for (int a = 0; a<x; a++) 
			{
				System.out.print("  ");
			}
			
			for (int c=0; c<(n-x); c++) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for ( int i=0; i < (n-1); i++) {
			
			for (int star=0; star<(i+2);star++) {
				
				System.out.print("* ");
			}
			
			for (int space=0; space<(n-2-i); space++) {
				
				System.out.print("  ");
			}
			
			for (int w=0; w<(n-2-i); w++ ) {
				
				System.out.print("  ");
			}
			
			for (int stars=0; stars<(i+2); stars++ ) {
				
				System.out.print("* ");
			}
			
			for (int s=0; s<(i+2);s++) {
				
				System.out.print("* ");
			}
			
			for (int sp=0; sp<(n-2-i); sp++) {
				
				System.out.print("  ");
			}
			
			for (int r=0; r<(n-2-i); r++ ) {
				
				System.out.print("  ");
			}
			
			for (int st=0; st<(i+2); st++ ) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void q14(int n) {
		
		for (int x = 0; x < n; x++)
		{
			
			for (int star = 0; star <(n-x); star ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for ( int i=0; i < (n-1); i++) {
			
			for (int star=0; star<(i+2);star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
		q11(5);
		
		System.out.println();
		
		q13(6);
		
		System.out.println();
		
		q14(5);
		
		System.out.println();
		
		q12(5);
		
		System.out.println();
		
		q15(5);
		
		System.out.println();
		
		q16(5);
		
		System.out.println();
		
		q17(8);
		
		System.out.println();

		q18(5);
		
		System.out.println();
		
		q19(5);
		
		System.out.println();
		
		q20(5);
		
		System.out.println();
		
		q21(5);
        
		System.out.println();
		
		q22(5);

	}

}
