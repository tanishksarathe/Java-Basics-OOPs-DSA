package sortingAlgorithms;

import java.util.Arrays;

public class Selection {
	
	/*
	 	Selection Sort
	 */

	public static int[] selectionSortA(int []a) {
		
		int z;
		
		int i=0;	
		
		while (i < a.length-1) {
			
			int min = a[i];	
			
			int j = i+1;
			
			while ( j < a.length) {
				
				if (a[j] < min) {

				  z = min;
				  
				  min = a[j];
				  
				  a[j] = z;
					
				  j++;
				  
				}
				else {
				
				j++;
				
				}
			}
			
			a[i] = min;
			
			i++;
			
		}
		return a;
	}
	
	
	/*
	 	D
	 */
	
	public static int[] selectionSortD(int []a) {
		
		int z;
		
		int i=0;	
		
		while (i < a.length-1) {
			
			int min = a[i];	
			
			int j = i+1;
			
			while ( j < a.length) {
				
				if (a[j] > min) {

				  z = min;
				  
				  min = a[j];
				  
				  a[j] = z;
					
				  j++;
				  
				}
				else {
				
				j++;
				
				}
			}
			
			a[i] = min;
			
			i++;
			
		}
		return a;
	}
	
	
	/*
	 	Sort the array in ascending order based on the
number of digits in each number. If multiple numbers
have the same number of digits, sort them in
ascending order.

	 */
	
	
	public static int count(int n) {
		
		int count =0;
		int x = Math.abs(n);
		
		while ( x>0) {
			
			x/=10;
			count++;
			
		}
		return count;
	}


	/*
	 	 Sort the array in ascending order based on the 
number of digits in each number. If multiple numbers 
have the same number of digits, sort them in 
ascending order.
	 */
	
	
	public static int[] digitOrder(int[]a) {
		
		for (int i =0; i < a.length-1; i++) {
			
			int min = i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if (count(a[j]) < count(a[min])) {
					
					min = j;
					
				}
				
				else if(count(a[j]) == count(a[min]) && a[j] < a[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
					
			}
			
			
		}
		return a;
	}
	
	
	/*
	 	 You are given an array of integers and a positive 
integer k. Use the Selection Sort algorithm to find the 
Kth smallest element in the array.
	 */
	
	public static int kthSmallest(int []a, int k) {
		
		int z;
		
		int i=0;	
		
		while (i < a.length-1) {
			
			int min = a[i];	
			
			int j = i+1;
			
			while ( j < a.length) {
				
				if (a[j] < min) {

				  z = min;
				  
				  min = a[j];
				  
				  a[j] = z;
					
				  j++;
				  
				}
				else {
				
				j++;
				
				}
			}
			
			a[i] = min;
			
			i++;
			
		}
		return a[k-1];
	}
	
	
	/*
	 	Given two arrays: one with student names and 
another with their scores, sort the students by their 
scores using Selection Sort. 
	 */
	
	public static String[] stringNum(int[]a, String[]b) {
		
		for (int i=0;  i< a.length-1; i++) {
			
			
			int min = i;
			
			int j = i+1;
			while (j < a.length) {
				
				if (a[j] < a[min]) min = j;
				j++;
			}
			
			if (min != i) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
				String name = b[i];
				b[i] = b[min];
				b[min] = name;
				
			}
			
//			System.out.println(Arrays.toString(a));
		}
		return b;
	}
	
	
	/*
	 	 Sort the array in ascending order based on the 
sum of the digits of each number using Selection Sort. 
	 */
	
	public static int sumofNumber(int n) {
		
		if ( n == 0 ) return 0;
		
		return sumofNumber(n/10) + n%10;
	}
	
	
	public static int[] sumOfDigitSort(int[]a) {
		
		for (int i=0; i < a.length-1; i++) {
			
			int min = i;
			
			int j = i+1;
			while(j < a.length) {
				
				if ( sumofNumber(a[j]) < sumofNumber(a[min]) ) min = j;
				
				j++;
			}
			
			if (min != i ) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
			}
			
			
		}
		
		return a;
		
	}
	
	
	
	/*
	 	Sort the array based on the units digit of each 
number in ascending order using Selection Sort. 
	 */
	
	
	public static int[] unitDigitSort(int[]a) {
		
		for (int i=0; i < a.length-1; i++) {
			
			int min = i;
			
			int j = i+1;
			while(j < a.length) {
				
				if ( a[j]%10 < a[min]%10 ) min = j;
				
				j++;
			}
			
			if (min != i ) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
			}
			
			
		}
		
		return a;
		
	}
	
	
	/*
	 	 Given an array of integers nums, sort the array 
in increasing order based on the frequency of the 
values. If multiple values have the same frequency, 
sort them in decreasing order. 
Return the sorted array. 
	 */
	
	
	public static int frequency(int []a, int n) {
		
		int count=0;
		
		for (int i=0; i < a.length ; i++) {
			
			if(a[i] == n) count++;
			
		}
		return count;
	}
	
	
	public static int[] frequencySort(int[]a) {
		
		for (int i=0; i < a.length-1; i++) {
			
			int min = i;
			
			int j=i+1;
			
			while (j < a.length) {
				
				if ( frequency(a, a[j]) < frequency(a, a[min])) min = j;
				
				j++;
			}
			
			if (min != i) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
			}
		}
		return a;
	}
	
	
	/*
	 	Sort only the elements at even indices of the 
array in ascending order using Selection Sort, while 
keeping the odd-indexed elements unchanged. 
	 */
	
	public static int[] evenSort(int[]a) {
		
		for (int i=0; i < a.length-1; i+=2) {
			
			int min = i;
			
			int j = i+2;
			while (j < a.length) {
				
				if (a[j] < a[min]) min = j;
				
				j+=2;
			}
			
			if (min != i) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
			}
		}
		return a;
	}
	
	
	
	/*
	 	You are given a 0-indexed integer array nums. 
Rearrange the values of nums according to the 
following rules: 
1. Sort the values at odd indices of nums in non
increasing order. 
For example, if nums = [4,1,2,3] before this 
step, it becomes [4,3,2,1] after. The values at 
odd indices 1 and 3 are sorted in non
increasing order. 
2. Sort the values at even indices of nums in non
decreasing order. 
• 
For example, if nums = [4,1,2,3] before this 
step, it becomes [2,1,4,3] after. The values at 
even indices 0 and 2 are sorted in non
decreasing order. 
Return the array formed after rearranging the values 
of nums. 
	 */
	
	public static int[] independentSort(int[]a){
		
		a = evenSort(a);
		
		for(int i =1; i < a.length-1; i++) {
			
			int min = i;
			
			int j = i+2;
			while (j < a.length) {
				
				if (a[j] > a[min]) min = j;
				
				j+=2;
			}
			
			if (min != i) {
				
				int z = a[i];
				a[i] = a[min];
				a[min] = z;
				
			}
			
		}
		return a;
	}
	

	public static void main(String[] args)
	{
		System.out.println("Selection Sort");
		
		int[]arr1 = {45,12,89,23,5,67};
		
		int []arr = {-123, 45, 6, 12, 7890, -90};
		
		int[]arr2 = {7,10,4,3,20,15};
		
		int[]arr3 = {50,80,70};
		
		String[]names = {"Alice", "Bob", "Charlie"};
		
		int[]arr4 = {23,45,12,56,34};
		
		int[]arr5 = {42,31,63,74,25};
		
		int[]arr6 = {1,1,2,2,2,3};
		
		int []arr7 = {4,1,7,2,3,5};
		
		int[]arr8 = {4,1,2,3};
		
		
		System.out.println(Arrays.toString(independentSort(arr8)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(unitDigitSort(arr5)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(evenSort(arr7)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(frequencySort(arr6)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(sumOfDigitSort(arr4)));
		
		System.out.println();
		
		System.out.println(kthSmallest(arr2, 3));
		
		System.out.println();
		
		System.out.println(Arrays.toString(stringNum(arr3, names)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(digitOrder(arr)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(selectionSortA(arr1)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(selectionSortD(arr1)));

	}

}
