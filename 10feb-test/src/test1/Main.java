package test1;

public class Main 
{
	
	public static void q20(int n) {
		
		for (int i=0; i<n; i++) {
			
			for (int space=0; space<i; space ++) {
				System.out.print("  ");
			}
			
			for (int star=0; star<(n-i); star++) {
				System.out.print("* ");
			}
			
			for (int x=0; x < (n-i-1); x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i =0; i<n; i++) {
			
			for (int space=0; space <(n-1-i); space++) {
				System.out.print("  ");
			}
			for (int star=0; star < (i+1); star++) {
				System.out.print("* ");
			}
			for (int k=0; k< (i); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void q21(int n) {
		
		for (int i=0; i< n; i++) {
			
			for (int space=0; space<(n-i-1); space++) {
				System.out.print("  ");
			}
			
			for (int star=0; star<=(i); star++) {
				System.out.print("* ");
			}
			for (int p=0; p<i; p++) {
				System.out.print("* ");
			}
			
			for (int spaces=0; spaces<(n-i-1); spaces++) {
				System.out.print("  ");
			}
			for (int sp=0; sp<(n-i-1); sp++) {
				System.out.print("  ");
			}
			
			for (int st=0; st<=(i); st++) {
				System.out.print("* ");
			}
			for (int ar=0; ar<(i); ar++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for (int i=0; i<(n-1) ; i++) {
			
			for (int spaces=0; spaces<=i; spaces++) {
				System.out.print("  ");
			}
			for (int star =0; star<(n-i-1);star++) {
				System.out.print("* ");
			}
			for (int stars=0; stars<(n-2-i); stars++) {
				System.out.print("* ");
			}
			
			for (int space=0; space<=i;space++) {
				System.out.print("  ");
			}
			for (int a =0; a<=i; a++) {
				System.out.print(" ");
			}
			for (int b =0; b<(n-i-1);b++) {
				System.out.print("* ");
			}
			
			for (int c=0; c<(n-2-i); c++) {
				System.out.print("* ");
			}
			

			System.out.println();
		}
		
	}
	
	
	public static void q22(int n) {
		
		for (int i=0; i < n; i++) {
			
			for (int a=0; a<(n-i); a++) {
				System.out.print("* ");
			}
			for (int space=0; space<i; space++) {
				System.out.print("# ");
			}
			
			for (int b=0; b<i; b++) {
				System.out.print("# ");
			}
			
			for (int c=0; c<(n-i); c++) {
				System.out.print("* ");
			}
			
			
			for (int d=0; d<(n-i); d++) {
				System.out.print("* ");
			}
			for (int e=0; e<i; e++) {
				System.out.print("# ");
			}
			
			for (int f=0; f<i; f++) {
				System.out.print("# ");
			}
			
			for (int g=0; g<(n-i); g++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		q20(5);
		
		System.out.println();
		
		q21(5);
		
		System.out.println();
		
		q22(5);

	}

}
