

public class Tanishk {

	public static void q1(int n) {
		
		int r=0;
		while (r<=n)
		{
			
			int c=0;
			while (c<=2*n) {
				
				System.out.print( (r==n || r+c==n || c-r == n) ? "* " :   "  ");
				c++;
				
			}
			
			System.out.println();
			
			r++;
		}
		
	}
	
	
	public static void q2(int n) {
		int r=0;
		while (r<=n) {
			
			int c=0;
			while (c<=2*n) {
				
				
				System.out.print((r==0 || c==r || r+c== 2*n)   ? "* " : "  ");
				c++;
				
			}
			
			
			System.out.println();
			r++;
		}
		
		
	}
	
	
	public static void q3 (int n) {
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while(c<=n) {
				
				System.out.print( ( c==0 || r==c || r+c == n*2 ) ?"* " : "  " );
				c++;
				
			}
			
			
			
			System.out.println();
			r++;
			
		}
		
	}
	
	
	public static void q4(int n) {
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while(c<=n) {
				
				
				System.out.print(( c==n || r+c == n || r-c == n ) ? "* " : "  ");
			c++;
			}
			
			
			System.out.println();
			r++;
			
		}
		
		
	}
	
	
	public static void q5(int n) {
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while(c<=2*n) {
				
				System.out.print( (r+c == n || r+c == 3*n || c-r == n || r-c == n) ? "* " : "  ");
				c++;
			}
			
			
			
			
			System.out.println();
			r++;
			
		}
		
	}
	
	
	public static void q6 (int n) {
		
		int r=0;
		while(r<=2*n) {
			
			int c=0;
			while(c<=2*n) {
				
				System.out.print( (r==c || r+c == 2*n || c==0 || c== 2*n ) ? "* " : "  " );

				c++;
			}
			
			
			System.out.println();
			r++;
			
		}
		
		
	}
	
	
	public static void q7(int n ) {
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while (c<=2*n) {
				
				System.out.print( (r+c == n || r+c == 3*n || r-c == n || c-r == n || c==n) ? "* " : "  ");
			c++;
			}
			
			
			System.out.println();
			r++;
			
		}
		
	}
	
	
	public static void q8(int n) {
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while (c<=2*n) {
				
				System.out.print( ( r==n || r-c == n || c-r == n || r+c ==n || r+c == 3*n) ? "* " : "  ");
				c++;
				
			}
			
			
			System.out.println();
			r++;
		}
		
		
	}
	
	public static void q9 (int n) {
		
		
		int r=0;
		while (r<=2*n) {
			
			int c=0;
			while( c<=2*n) {
				
				System.out.print( (r+c == 3*n || r-c ==n || c-r == n || c==0 || c== 2*n || r+c ==n) ? "* " : "  ");
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
		
	}
	
	
	public static void q10(int n) {
		
		
		int r=0;
		while (r<=2*n) {
			
			
			int c=0;
			while (c<=2*n) {
				System.out.print( (r==0 || r== 2*n || r-c == n || c-r ==n || r+c == n || r+c == 3*n) ? "* " : "  ");
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println();
		
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
	}
	
}
