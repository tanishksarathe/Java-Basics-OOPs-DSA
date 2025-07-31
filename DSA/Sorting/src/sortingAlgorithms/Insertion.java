package sortingAlgorithms;

import java.util.Arrays;

public class Insertion {

	/*
	 	Write a program to sort the following array in
increasing order using the Insertion Sort algorithm.
	 */
	
	public static int[] insertionA(int[]a) {
		
		for (int i =1; i < a.length; i++) {
			
			int key = a[i];
			
			int j = i-1;
			
//			while (a[j] > key && j >=0 ) {
			
				while (j >=0 && a[j] > key ) {
				
				a[j+1] = a[j];
				
				j--;
			}
			
			a[j+1] = key;
			
		}
		
		return a;
	}
	
	
	/*
	 	Write a program to sort the following array in
decreasing order using the Insertion Sort algorithm.
	 */
	
	
	public static int[] insertionD(int[]a) {
		
		for (int i =1; i < a.length; i++) {
			
			int key = a[i];
			
			int j = i-1;
			
//			while (a[j] > key && j >=0 ) {
			
				while (j >=0 && a[j] < key ) {
				
				a[j+1] = a[j];
				
				j--;
			}
			
			a[j+1] = key;
			
		}
		
		return a;
	}
	
	
	
	public static int[] insertionDec(int[]a) {
		
		for (int i=1; i < a.length; i++) {
			
			int key = a[i];
			
			int j = i-1;
			
			while (j >=0 && a[j] < key) {
				
				a[j+1] = a[j];
				
				j--;
				
			}
			a[j+1] = key;
			
		}
		return a;
	}
	
	
	
	/*
	 	Write a program to implement the Insertion
Sort algorithm to sort an array of strings. The sorting
should be done based on the length of the strings in
ascending order. If two strings have the same length,
they should be sorted alphabetically
	 */
	
	
	public static int lengthString(String n) {
		return n.length();
	}
	
	public static String[] stringLengthSort(String[]a) {
		
		for (int i =1; i < a.length; i++) {
			
			String key = a[i];
			
			int j = i-1;
			
				while (j >=0 ) {
				
					if (lengthString(a[j]) > lengthString(key) ) {
					
						a[j+1] = a[j];
				
							j--;
					}
					
					else if (lengthString(a[j]) == lengthString(key)) {
						
						if ((a[j]).charAt(0) > (key).charAt(0) ) {
							
							a[j+1] = a[j];
							
							j--;
							
						} 
						else {
							break;
						}
						
					} 
					else {
						break;
					}
					
				}
			
			a[j+1] = key;
			
		}
		
		return a;
	}
	
	
	// second approach 
	
	
	public static String[] stringAlpha(String[]a) {
		
		for (int i = 1; i < a.length; i++) {
			
			String key = a[i];
			
			int j =i-1;
			
			while( ( j >= 0 && a[j].length() > key.length()) || ( j>= 0 && a[j].length() == key.length() && a[j].charAt(0) > key.charAt(0)) ) {
				
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = key;
			
		}
		return a;
	}
	
	
	/*
	 	Write a program to implement the Insertion
Sort algorithm for an array containing floating-point
numbers (double). The array should be sorted in
ascending order.
	 */
	
	public static double[] floatingSort(double[]a) {
		
		for (int i =1; i < a.length; i++) {
			
			double key = a[i];
			
			int j = i-1;
			
				while (j >=0 && a[j] > key ) {
				
				a[j+1] = a[j];
				
				j--;
			}
			
			a[j+1] = key;
			
		}
		
		return a;
	}
	
	
	
	/*
	 	Write a program to sort an array of strings
based on the number of vowels in each string using
insertion sort. If two strings have the same number of
vowels, sort them alphabetically.
	 */
	
	
	public static int countVowels(String n) {
	
		int count=0;
		
		for (int i=0; i < n.length(); i++) {
			
			if(n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O' || n.charAt(i) == 'U' || n.charAt(i) == 'a' ||n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u'){
				
				count++;
				
			}
			
		}
		return count;
	}
	
	
	public static String[] vowelSort(String[]a) {
		
		for (int i =1; i < a.length; i++) {
			
			String key = a[i];
			
			int j = i-1;
			
				while (j >=0 ) {
				
					if (countVowels(a[j]) > countVowels(key)) {
						
						a[j+1] = a[j];
						
						j--;
						
					}
					
					else if (countVowels(a[j]) == countVowels(key)) {
						
						if (a[j].charAt(0) > key.charAt(0)) {
							
							a[j+1] = a[j];
							
							j--;
							
						} else {
							break;
						}
						
					} else {
						break;
					}
				
			}
			
			a[j+1] = key;
			
		}
		
		return a;
	}
	
	
	// second approach 
	
	
	public static String[] stringAlphaVowel(String[]a) {
		
		for (int i = 1; i < a.length; i++) {
			
			String key = a[i];
			
			int j =i-1;
			
			while( ( j >= 0 && countVowels(a[j]) > countVowels(key)) || ( j>= 0 && countVowels(a[j]) == countVowels(key) && a[j].charAt(0) > key.charAt(0)) ) {
				
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = key;
			
		}
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[]arr = {12,11,13,5,6};
		
		double[]arr1 = {2.56,1.1,3.141,0.567,2.0};
		
		String[]arr2 = {"banana", "zbcd", "pear", "kiwi", "ciku", "apple", "orange"};
		
		String[]arr3 = {"apple", "banana", "grape", "kiwi"};
		
		System.out.println(Arrays.toString(insertionA(arr)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(insertionD(arr)));
	
		System.out.println();
		
		System.out.println(Arrays.toString(floatingSort(arr1)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(stringAlpha(arr2)));
	
		System.out.println();
		
		System.out.println(Arrays.toString(stringAlphaVowel(arr3)));
		
	}

}
