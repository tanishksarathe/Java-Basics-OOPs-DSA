package subtract;

public class Main 
{	
	public static int subtraction(int x, int y) {
		
		int result = x - y;
		
		return result;
	}
	
	public static void multiply(int x, int y) {
		
		int result = (x * y);
		System.out.println(result);
	}
	
	public static float division (float c, float d) {
		
		float result = c/d;
		return result;
	}
	
	
	public static double calculateSimpleIntrest(int p, double r, int t) {
		 
		return (p*r*t)/100;
		
	}

	public static void main(String[] args) 
	{
		
		int d = 200000;
		double e = 9.5;
		byte c = 3;
		
		int a = 65;
		int b = 64;
		
		System.out.println(subtraction(a, b));
		
		multiply(a, b);
		
		System.out.println(division(a, b));
		
		System.out.println(calculateSimpleIntrest(200000 ,9.5 ,3 ));

	}

}
