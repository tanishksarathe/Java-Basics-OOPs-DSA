package hollowone;

public class Hollow 
{
	public static void q1(int n) {
		
		int r=0;
		while (r < n) 
		{
			int c=0;
			while (c < n) {
				System.out.print((r==0 || r == (n-1))? "* " : "  ");
				c++;
			}
			System.out.println();
			r++;
		}
		
	}
	
	public static void q2(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c <n) {
				
				System.out.print( (c==0 || c==(n-1)) ? "* " : "  " );
				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q3(int n) {
		
		int r=0;
		while (r <= n) {
			
			int c=0;
			while (c<=n+1) {
				
				System.out.print( (r==0 || c==0|| c==(n+1) || r==(n)) ? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q4(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<=n) {
				
				System.out.print((c==0|| r==(n-1) || c==(n)) ? "* " : "  ");
				
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q5(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<=n) {
				
				System.out.print( (r==0 || c==0 || c==(n)) ? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q6(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==c) ? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
		
		
	}
	
	
	public static void q7(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r+c == n-1 )? "* ": "  ");
			c++;
			}
			System.out.println();
			r++;
		}
		
	}
	
	public static void q8(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==c || r+c == (n-1)) ? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
	}
	
	
	public static void q9(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==0 || r+c == (n-1) || r==(n-1)) ? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q10(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==0) || (r==(n-1) || r==c)? "* " : "  " );
				
				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q11(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r == (n/2) || c== (n/2)) ? "* " : "  " );
				
				c++;
				
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q12 (int n) {
		
		int r=0;
		while (r <n) {
			
			int c=0;
			while (c < n) {
				
				System.out.print( (r==0 || c==0 || r== (n-1) || c==(n-1) || c== (n/2)) ? "* " : "  " );

				c++;
			}
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q13(int n) {
		
		int i=0;
		while (i < n) {
			
			int j=0;
			while (j < n) {
				
				System.out.print( (j==0 || i == (n-1) || i==j) ? "* " : "  " );
				
				j++;
			}
			
			
			System.out.println();
			i++;
		}
	}
	
	
	public static void q14(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==0 || c==0 || r+c == (n-1)) ? "* " : "  " );
				
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q15(int n) {
		
		int r=0;
		while (r < n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (c== (n-1) || r==(n-1) || r+c == (n-1)) ? "* " : "  " );
				
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q16(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c <n) {
				
				System.out.print( (r==0 || c==(n-1) || r==c) ? "* " : "  " );
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q17(int n) {
		
		int r=0;
		while (r<n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( ( r==0 || c==0 || r==(n-1) || c==(n-1) || r==(n/2) || c==(n/2))? "* " : "  " );
				c++;
			}
			
			
			System.out.println();
			r++;
		}
		
	}
	
	
	public static void q18 (int n) {
		
		int r=0;
		while (r <n) {
			
			int c=0;
			while (c<n) {
				
				System.out.print( (r==0 || c==0 | r==(n-1) || c==(n-1) || r+c == (n-1) || r==c)? "* " : "  " );
				c++;
				
			}
			
			System.out.println();
			r++;
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
		
		q11(5);
		
		System.out.println();
		
		q12(5);
		
		System.out.println();
		
		q13(5);
		
		System.out.println();
		
		q14(5);
		
		System.out.println();
		
		q15(5);
		
		System.out.println();
		
		q16(5);
		
		System.out.println();
		
		q17(5);
		
		System.out.println();
		
		q18(5);
		
		
		
		

	}

}
