package loop;

public class Main 
{
	
	
	public static void horizontalline() {
		
		for(int i =0; i < 5; i++) {
			System.out.print("* ");
		}
		
	}

	
	public static void verticalline() {
		
		for(int i =0; i < 5; i++) {
			System.out.println("* ");
		}
		
	}
	
	
	public static void leftTriangle() 
	{
		
		for (int i = 1; i <= 4 ; i++)
		{
			
			for (int space = 1; space <= 4-i; space++ ) 
			{
				
				System.out.print(" ");
				
			}
			
			for (int star = 1; star <= i ; star++) 
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	
	public static void pyramid() {
		
		for (int i = 1 ; i <= 4 ; i++) {
			
			for (int space = 1; space <= 4 -i; space ++) {
				
					System.out.print(" ");
				
			}
			
			for (int star = 1; star <= i ; star++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public static void downwardPyramid() {
		
		for (int i  = 0; i <= 3; i++) {
			
			for (int space = 0 ; space < i ; space ++) {
				
				System.out.print(" ");
				
			}
			
			for (int star = 0; star < 4-i ; star ++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	
	
	public static void usT(int n) {
		
		for (int i =0; i <= n; i++) {
			
			for (int space = 0; space < (n-i); space++) {
				
				System.out.print("  ");
				
			}
			
			for (int star = 0; star < i; star++) {
				
				System.out.print("* ");
				
			}
  			System.out.println();
		}
		
	}
	
	
	
	public static void downTriangle( int x ) {
		
		 for (int i = 0; i < x; i++) {
			 
			 for (int c=0 ; c < i; c++) {
				 
				 System.out.print("  ");
				 
			 }
			 
			 for (int star = 0; star < (x-i) ; star++) {
				 
				 System.out.print("* ");
				 
			 }
			 System.out.println();
		 }
		 	
			
	}
	
	
	
	
	public static void  squarepattern(int n) {
		
		 for (int i = 0; i < n; i++) {
			 
			 for (int col = 0; col<n ;col++) {
				 
				 System.out.print("* ");
				 
			 }
			 
			 System.out.println();
			 
		 }
		
	}
	
	
	public static void increasingTriangle(int y) {
		
		for (int i = 0; i< y ; i++) {
			
			for (int col = 0 ; col <= i; col ++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void decreasingTriangle(int x) {
		
		for (int  i= 0; i < x; i++ ) {
			
			for (int col = x; col >i ; col --) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	
	
	public static void triPyramid(int n) {
		
		
		for (int i =0; i < n; i++ ) {
			
			
			for (int space = 0; space <(n-i-1); space++) {
				
				System.out.print("  ");
				
			}
			
			for (int star = 0; star <= i; star ++) {
				
				System.out.print("* ");
				
			}
			
			for (int j = 1; j <=i; j++) {
				
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
 		
		
	}
	
	
	public static void tridecPyramid(int n) {
		
		for (int i = 0; i < n; i ++) {
			
			for (int space =0; space <i ; space ++) {
				
				System.out.print("  ");
			}
			
			for (int star = 0; star < (n-i); star++ ) {
				
				System.out.print("* ");
			}
			
			for (int k = 0; k< (n-i-1); k++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

	

	
	
	
	

	public static void main(String[] args)
	{
		
		horizontalline();
		
		System.out.println();
		
		verticalline();
		
		System.out.println();
		
		pyramid();
		
		System.out.println();
		
		downwardPyramid();
		
		System.out.println();
		
		squarepattern(7);
		
		System.out.println();
		
		increasingTriangle(5);
		
		System.out.println();
		
		decreasingTriangle(5);
		
		System.out.println();
		
		downTriangle(5);
		
		System.out.println();
		
		usT(4);
		
		System.out.println();
		
		triPyramid(7);
		
		System.out.println();
		
		tridecPyramid(5);
		
		
	}

}
