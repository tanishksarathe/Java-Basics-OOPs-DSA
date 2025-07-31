package sheet1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	/*
 		Write a program to declare, initialize, and display the
		elements of an integer array.
	*/
	
	public static void displayArray(int []arr) {
		
		System.out.println("Array Elements");
		
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	
	/*
	 Write a program to take an array of integers and
traverse it from start to end. Display all the elements of the
array.
	 */
	
	public static void userArray() {
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array :");
		
		int size = objScanner.nextInt();
		
		int []y = new int[size];
		
		for (int i=0; i < size; i++) {
			
			System.out.print("Enter value " + i + " ");
			
			y[i] = objScanner.nextInt();
		}
		
		for (int i =0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		
	}
	
	
	/*
	 	Write a program to take an array of integers and
traverse it from end to start. (also known as Reverse
Traversing) 

	 */
	
	public static void reverseTraversing(int []arr) {
		
		System.out.println("Array Reverse");
		System.out.println();
		
		for(int i = arr.length - 1; i >= 0; i--) 
		{
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	/*
	 		 Write a program to take an array and traverse it from
start to half.
	 */
	
	public static void startHalf(int[]arr) {
		
		System.out.println("Array Start to half");
		for(int i=0; i < arr.length / 2; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	/*
	  		Write a program to take an array and traverse it from
end to half.
	 */
	
	public static void endHalf(int []arr) {
		
		System.out.println("Array end to half");
		
		for (int i = arr.length-1; i >= arr.length/2; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	/*
	 		 Write a program to take an array and traverse it from
half to start.
	 */
	
	
	public static void halfStart(int []arr) {
		
	System.out.println("Array Half to start");
		
		for (int i = arr.length/2; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	/*
	 		Write a program to take an array and traverse it from
half to end.
	 */
	
	
	public static void halfEnd(int []arr) {
		
	System.out.println("Array half to end");
		
		for (int i = arr.length/2; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	/*
	 	Write a program to print minimum element of an
array
	 */

	
	public static int minimum(int[] n)
	{
		int min = n[0];
		for (int i =0; i < n.length; i++ )
		{
			
			
			if(n[i] < min) {
				min = n[i];
			}
			
		}
		
		return min;
	}
	
	
	/*
	 		Write a program to print maximum element of an
array.
	 */
	
	public static int maximum(int []n)
	{
		
		int max = n[0];
		
		for (int i =0; i < n.length; i++) 
		{
			if(n[i] > max) {
				max = n[i];
			}
		}
		
		return max;
	}
	
	
	/*
	 	Write a program to print span of an array
	 */
	
	
	public static int span(int []a) 
	{
		return maximum(a)-minimum(a);
	}
	
	
	/*
	 	Write a program to print 2 arrays together using
single for loop.
	 */
	
	
	public static void printsimul(int[]a, int[]b) 
	{
		for (int i =0; i < (a.length) ; i++) {
			
			System.out.println(a[i] + " "+ b[i]);
			
		}
	}
	
	
	/*
	 	 Write a program to print the sum of all elements in a
given array.
	 */
	
	
	public static int sumArray(int[]a) 
	{
		int sum =0;
		
		for (int i=0; i < a.length ; i++) 
		{
			sum = sum + a[i];
		}
		
		return sum;
	}
	
	/*
	 	Write a program to create a new array containing
only the even elements of a given array. The program should:
1. Take an input array of integers.
2. Create a new array to store only the even elements from
the input array.
3. Return the new array and display its contents.

	 */
	
	public static void q13() 
	{
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array :");
		
		int size = objScanner.nextInt();
		
		int []y = new int[size];
		
		for (int i=0; i < size; i++) {
			
			System.out.print("Enter value " + i + " ");
			
			y[i] = objScanner.nextInt();
			
		}
		
		for (int i =0; i < y.length; i++) {
			
			if(y[i]%2==0) {
			System.out.print(y[i] + " ");
			}
			else {
				continue;
			}
		}
		
		
	}
	
	
	/*
	 	 Write a program to create a new array containing
only the odd elements of a given array. The program should:
1. Take an input array of integers.
2. Create a new array to store only the odd elements from
the input array.
3. Return the new array and display its contents.
	 */
	
	
	public static void printOddArray() {
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Enter the size of array :");
		
		int size = objScanner.nextInt();
		
		int []y = new int[size];
		
		for (int i=0; i < size; i++) {
			
			System.out.print("Enter value " + i + " ");
			
			y[i] = objScanner.nextInt();
			
		}
		
		for(int i=0; i < y.length; i++) {
			
			if(y[i]%2!=0) {
				System.out.print(y[i] + " ");
			}
			else {
				continue;
			}
			
		}
	}
	
	
	/*
	 	Write a program to print Sum of only even elements
of an array.
	 */
	
	
	public static int sumEven(int[]a) 
	{
		int sum =0;
		for (int i=0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				sum = sum + a[i];
			}
		}
		return sum;
	}
	
	
	/*
	 	 Write a program to print Sum of only odd elements
of an array.
	 */
	
	
	public static int sumOdd(int []a) {
		
		int sum =0;
		
		for (int i=0; i < a.length; i++) {
			if(a[i]%2 != 0) {
				sum += a[i];
			}
		}
		return sum;
		
	}
	
	
	/*
	 	Write a program to print product of only even
elements of an array.
	 */
	
	
	public static int prodEven(int[]a) {
		
		int pro=1;
		
		for (int i=0; i < a.length; i++) {
			if(a[i]%2==0) {
				pro*=a[i];
			}
		}
		return pro;
		
	}
	
	
	/*
 	Write a program to print product of only odd
elements of an array.
 */
	
	
	public static int prodOdd(int[]a) {
		
		int pro=1;
		
		for (int i=0; i < a.length; i++) {
			if(a[i]%2!=0) {
				pro*=a[i];
			}
		}
		return pro;
		
	}
	
	/*
	 	Write a program to count the number of even and
odd elements in an array.
	 */
	
	
	public static void countEvenOdd(int[]a)
	{
		int even = 0;
		int odd = 0;
		
		for (int i =0; i < a.length; i++) {
			
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("Even " + even);
		System.out.println();
		System.out.println("Odd " + odd);
	}
	
	
	/*
	 	Write a program to find the Square and Cube of all
elements of an array and store the results in two separate
arrays. Return the new arrays.
	 */
	
	
	public static void squareCube(int []a)
	{
		int[]b = new int[5];
		
		int[]c = new int[5];
		
		for (int i=0; i<a.length; i++) 
		{
			c[i] = (a[i]*a[i]*a[i]);
			b[i] = (a[i]*a[i]);
		}
		
		System.out.print("Square :");
		
		for(int i=0; i <a.length; i++) {
		System.out.print(b[i] + " ");	
		}
		
		System.out.println();
		
		System.out.print("Cube :");
		
		for(int i=0; i < a.length; i++) {
			System.out.print(c[i] + " ");
		}
		
	}
	
	
	/*
	 		Write a program to find the Square Root and Cube
Root of all elements of an array and store the results in two
separate arrays. Return the new arrays
	 */
	
	
	public static void squareCubeRoot(int[]a, int[]e) {
		
		int []b = new int [a.length];
		int []c = new int [a.length];
		
		for (int i=0; i < a.length ; i++) {
			b[i] = (int) Math.sqrt(a[i]);
			c[i] = (int) Math.cbrt(e[i]);
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println(Arrays.toString(c));
	}
	
	
	/*
	 	Write a program to store only two digit elements of
an array in new array. Return the new Array.

	 */	
	
	public static void twoDigitElement(int []a) {
		
		int []b = new int[5];
		
		for (int i=0; i < a.length; i++) {
			if ((a[i] > 9 || a[i] < -9) && (a[i] < 100 || a[i] > -100 )) {
				b[i] = a[i];
			}
			else {
				continue;
			}
		}
		
		for (int i = 0; i < b.length-1; i++) {
			
			if(b[i] != 0) {
				System.out.print( b[i] + " ");
			}
			else {
				continue;
			}
		}
	}
	
	
	/*
	 	 Write a program to print the number of digits
present in every integer element of an array.
	 */
	
		
	public static int countdigits(int n) {
				
		if (n == 0) return 0;
		
		return countdigits(n/10) + 1;
		
	}
	
	
	public static void q23(int []a) {
		
		System.out.println("Q 23");
		
		for (int i=0; i < a.length; i++) {
			
		int val = countdigits(a[i]);
			
			System.out.println( a[i] + " is a " + val + " digit number");
		}
		
	}
	
	
	
	
	/*
	 	Write a program to find and store the prime
elements of an array in a new array. The program should
return the new array containing only the prime numbers.
	 */
	
	
	public static void printPrime(int []a) {
		
		int []b = new int[5];
		
		for(int i=0; i < a.length; i++) {
			
			int count = 0;
			for (int j = 2; j < a[i]; j++) 
			{
				
				if(a[i] == 1) b[i] = a[i];
				
				if(a[i]%j != 0) {
					count++; 
				}				
				else {
					count = 0;
					break;
				}
			}
			if(count > 0) b[i] = a[i]; 	
		}
		
		for (int k=0; k < b.length; k++) {
			if (b[k] != 0) System.out.print( b[k] + " " );
		}
		
	}
	
	
	/*
	 	Write a program to find whether the given element
is present in an array or not.
	 */
	
	
	public static void findNumber(int []a, int n) {
		
		int count=0;
		
		for (int i =0; i < a.length; i++) {
			
			if ( a[i] == n ) {
				count++;
				break;
			}
			
		}
		if(count > 0) {
			System.out.println("Number is present");
		}
		else {
			System.out.println("Number is not Preent");
		}
		
	}
	
	
	/*
	 	 Write a program to print the number of occurrence
of a given element in an array.

	 */
	public static void occurence(int[] a) {

	    System.out.println("Q 27");

	    for (int i = 0; i < a.length; i++) {

	    boolean alreadyCounted = false;

	        for (int j = 0; j < i; j++) {
	        	
	            if (a[i] == a[j]) {
	            	
	                alreadyCounted = true;
	                
	                break;
	            }
	        }
	        
	        if (alreadyCounted) {
	            continue;
	        }

	        
	        int count = 1;
	        
	        for (int k = i + 1; k < a.length; k++) {
	         
	        	if (a[i] == a[k]) {
	            
	        		count++;

	        	}
	        
	        }

	        System.out.println("Occurrence of " + a[i] + " is " + count);
	    }
	}

	
	/*
	 	Write a program to find and store the sum of
elements of 2 arrays Index wise in a new array. Return the
new array.(both the arrays should have equal number of
elements)

	 */
	
	
	public static void sumArrays(int []a, int[]b) {
		
		int []sum= new int [5];
		
		for (int i=0; i < a.length; i++) {
			
			sum[i] = (a[i] + b[i]);
			
		}
		
		for (int j =0; j < sum.length; j++) {
			System.out.print(sum[j] + " ");
		}
		
	}
	
	
	/*
	 	 Write a program to find and store the product of
elements of 2 arrays Index wise in a new array. Return the
new array.(both the arrays should have equal number of
elements)

	 */
	
	
	public static void prodArrays(int[]a, int[]b) {
		
		int []prod = new int[5];
		
		for (int i=0; i < b.length; i++) {
			
			prod[i] = (a[i]*b[i]);
			
		}
		
		for (int j=0; j < prod.length; j++) {
			System.out.print(prod[j] + " ");
		}
		
	}
	
	
	/*
	 		Write a program to calculate the sum and product of
the elements of two arrays, both the arrays should have
unequal numbers of elements. For indexes where elements
are not present in one of the arrays, simply print the
remaining elements of the longer array as they are. The
results should be stored in new arrays and returned.
	 */
	
	
	
	public static void sumPro(int []a, int[]b) {
		
		System.out.println("Q30");
		
		int max = Math.max(a.length, b.length);
		
		int []c = new int[max];
		int []p = new int[max];
		
		if (a.length > b.length) {
			
			for (int i=0; i < a.length; i++) {
				
				if ( i < b.length) {
					c[i] = a[i] + b[i];
					p[i] = a[i]*b[i];
				}
				else {
					c[i] = a[i];
					p[i] = a[i];
				}
			
			}
			
		}
		
		else if (b.length > a.length) {
			
			for (int i=0; i < b.length; i++) {
				
				if ( i < a.length) {
					c[i] = a[i] + b[i];
					p[i] = a[i] * b[i];
				}
				else {
					c[i] = b[i];
					p[i] = a[i];
				}
			
			}
			
		}
		
		else if (a.length == b.length) {
			
			for (int i=0; i < a.length; i++) {
				
				c[i] = (a[i] + b[i]);
				p[i] = a[i] * b[i];
				
			}	
			
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println();
		System.out.println(Arrays.toString(p));
		
	}
	
	
	public static void main(String[] args) 
	{
		int x[] = {1,2,3,4,5};
		
		int []y = {5,7,3,9,4};
		
		int []z = {5,25,456,86,789};
		
		int []occ = {1,2,2,2,4,47,8,5,6};
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int []arr1 = { 1,4,9,16,25 };
		
		int arr2[] = {1,8,27,64,125};

		System.out.println();
		
		System.out.println(minimum(y));
		
		System.out.println();
		
		displayArray(arr);
		
		System.out.println();
		
		reverseTraversing(arr);
	
		System.out.println();
		
		startHalf(arr);
		
		System.out.println();
		
		halfEnd(arr);
		
		System.out.println();
		
		endHalf(arr);
		
		System.out.println();
		
		halfStart(arr);
		
		System.out.println();
		
		System.out.println(maximum(y));
		
		System.out.println();
		
		System.out.println(span(y));
		
		System.out.println();
		
		printsimul(x, y);
		
		System.out.println();
		
		System.out.println(sumArray(x));
		
		System.out.println();

		
		System.out.println(sumEven(x));
		
		System.out.println();

		
		System.out.println(sumOdd(y));
		
		System.out.println();

		
		System.out.println(prodEven(x));
		
		System.out.println();
		
		System.out.println(prodOdd(y));
		
		System.out.println();
		
		countEvenOdd(x);
		
		System.out.println();

		sumPro(arr, x);
		
		System.out.println();
		
		squareCube(x);		
		
		System.out.println();

		
		twoDigitElement(z);
		
		System.out.println();

		printPrime(y);

		System.out.println();
		
		findNumber(z, 86);
		
		System.out.println();
		
		occurence(occ);
		
		System.out.println();
		
		q23(z);
		
		System.out.println();

		prodArrays(x, y);
		
		System.out.println();
		
		squareCubeRoot(arr1, arr2);
		
		System.out.println();
		
		sumArrays(x,y);
		
		System.out.println();
		
		userArray();
		
		System.out.println();
		
		q13();
		
		System.out.println();
		
		printOddArray();
		
		
		
	}

}
