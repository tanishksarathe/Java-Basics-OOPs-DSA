package hollowpattern;

public class Main 
{
	
	public static void q8(int n) {
		
		for (int r=0; r<n; r++)
		{
			for (int c=0; c<n; c++) {
				
				if (r+c==(n-1) || r==c) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void q1(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n; c++) {
				
				if (r==0 || r==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q3(int n) {
		
		for (int r=0; r<n; r++)
		{
		
			for (int c=0; c<n; c++)
			{
				
				if(r==0 || c == 0 || r == (n-1) || c == (n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
	
	
	public static void q2(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n; c++) {
				
				if (c==0|| c== (n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public static void q4(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==0|| c==(n-1) || r==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q5(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==0|| c==(n-1) || r==(0)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q6(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==r) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q7(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r+c==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q9(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r==0 || r+c==(n-1) || r==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q10(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r==0 || r==c || r==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	public static void q11(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==(n/2) || r==(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q17(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==0|| r%(n/2)==0 ||r==0||c==(n-1)||r==(n-1)||c%(n/2)==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q12(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==0||r==0||c==(n-1)||r==(n-1)||c%(n/2)==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void q13(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==0 || r == (n-1) || c==r) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q14(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r==0 || c==0 || r+c == (n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void q15(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(c==(n-1)|| r==(n-1)|| r+c==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void q16(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r==0 || c==(n-1) || c==r) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void q18(int n) {
		
		for (int r=0; r<n; r++) {
			
			for (int c=0; c<n;c++) {
				
				if(r==0 || c==0 || r+c == (n-1)|| r==c || r==(n-1) || c==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		
		q1(5);
		
		System.out.println();
		
		q2(5);
		
		System.out.println();
		
        q3(5);
		
		System.out.println();
		
		q4(5);
		
		System.out.println();
		
		q5(5);
		
		System.out.println();
		
		q6(5);
		
		System.out.println();
		
		q7(5);
		
		System.out.println();
		
		q8(5);
		
		System.out.println();
	
		q9(5);
		
		System.out.println();
		
		q10(5);
		
		System.out.println();

		q11(7);
		
		System.out.println();
		
		q12(7);
		
		System.out.println();
		
		q13(5);
		
		System.out.println();
	
		q14(5);
		
		System.out.println();
		
		q15(5);
		
		System.out.println();

		q16(7);

		System.out.println();
		
		q17(7);
		
		System.out.println();
		
		q18(7);
		
		
	}

}
