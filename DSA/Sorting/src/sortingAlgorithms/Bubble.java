package sortingAlgorithms;

import java.util.Arrays;

public class Bubble {

	/* Bubble Sort */
	
	
	public static int[] bubbleSortD(int []a) {
		
		int z;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] < a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return a;
	}
	
	/*
	 	Ascending Order
	 */
	
	
	public static int[] bubbleSortA(int []a) {
		
		int z;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] > a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return a;
	}
	
	
	/*
	 		Sort only the first k elements of an array in
ascending order using Bubble Sort, leaving the rest of
the array unsorted.

	 */
	
	
	public static int[] bubbleSortK(int []a, int k) {
		
		int z;
		
		for (int i=0; i < k-1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < k-1-i; j++) {
		
				 if (a[j] > a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return a;
	}
	
	
	/*
	 	 Write a program to count the minimum number
of swaps required to sort an array using Bubble Sort.
	 */
	
	
	public static int bubbleSort4(int []a) {
		
		int z;
		
		int count=0;
		
		for (int i=0; i < a.length-1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] > a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 count++;
					 
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return count;
	}
	
	
	/*
	 	Write a program that uses Bubble Sort to find
the kth largest element in the array. After sorting the
array using Bubble Sort, return the kth largest element.
	 */
	
	public static int kthLargest(int []a, int k) {
		
		int z;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				
				
				 if (a[j] < a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return a[k-1];
	}
	
	
	
	/*
	 You are given an array of integers. Your task is
to sort only the odd elements of the array using the
Bubble Sort algorithm while keeping the even elements
in their original positions. After sorting the odd
elements, the array should remain in the same order
except for the odd elements which should be sorted in
ascending order.
	 */
	
	
	public static int[] oddSort(int []a) {
		
		int z;
		
		for (int i=0; i < a.length-1; i++) {
			
			boolean flag = true;
			
			for (int j=0; j < a.length-2-i; j++) {
				
				while (a[j] %2 == 0) {
					
					j++;
					
				}
				
				int first = a[j];
				
				int k = j+1;
				
				while (a[k] %2 == 0) {
					
					(k)++;
					
				}
				
				int second = a[j+1];
				
				if (first > second) {
					
					z=a[j];
					a[j] = a[k];
					a[k] = z;
					
					flag = false;
				}
				
			}
			
			if (flag) {
				break;
			}
			
		}		
		return a;
	}
	
	
	
	/*
	 	You are given an array of strings names, and an
array heights that consists of distinct positive integers.
Both arrays are of length n.
	 */
	

	public static String[] stringNum(int []a, String[]name) {
		
		int z;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] < a[j+1]) {
					 
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					 
					String n = name[j];
					 name[j] = name[j+1];
					 name[j+1] = n;
					 
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return name;
	}
	
	
	/*
	 	Given an integer array nums sorted in non
decreasing order, return an array of the squares of 
each number sorted in non-decreasing order. 
	 */
	
	public static int[] squareSort(int[]a) {
		
		int[]b = new int[a.length];
		
		for (int i=0; i < a.length; i++) {
			
			b[i] = (a[i] * a[i]);
			
		}
		
		bubbleSortA(b);
		
		return b;
		
	}
	
	
	/*
	 	Given an array nums with n objects colored red, 
white, or blue, sort them in-place so that objects of the 
same color are adjacent, with the colors in the order 
red, white, and blue. 
We will use the integers 0, 1, and 2 to represent the 
color red, white, and blue, respectively. 
	 */
	
	public static int[] redWhiteBlue(int []a) {
		
		int z;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] > a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}		
		return a;
	}
	
	
	/*
	 	Implement an optimized version of Bubble Sort 
that stops the sorting process early if no swaps are 
made during a complete pass through the array, 
indicating that the array is already sorted. 
	 */
	
	public static int[] optimized(int []a) {
		
		int z;
		
		int count=0;
		
		for (int i=0; i < a.length -1; i++) {
			
			boolean flag = true;
			
			for (int j = 0; j < a.length-1-i; j++) {
		
				 if (a[j] > a[j+1]) {
					 z = a[j];
					 a[j] = a[j+1];
					 a[j+1] = z;
					
					 count++;
					 
					 flag = false;
				 }
			}
			if (flag) {
				break;
			}
			
		}	
		
		System.out.println("Total number of iterations to sort given array is : "+ count);
		
		return a;
	}
	
	
	
	public static void main(String[] args) {
	
		int []arr1 = {12,8,15,6,10};
		
		int[]arr2 = {9,3,7,5,8,1};
		
		int[]arr3 = {4,3,1,2};
		
		int[]arr4 = {10,20,15,30,40};
		
		int[]arr5 = {2,5,3,8,7,6};
		
		int[]arr6 = {10,5,7,8,9,2};
		
		int[]arr7 = {2,13,7,6,8,6,3,12,9};
		
		String[]names = {"Mary", "John", "Emma"};
		
		int[]heights = {180,165,170};
		
		int[]arr8 = {-4,-1,0,3,10};
		
		int[]arr9 = {2,0,2,1,1,0};
		
		int[]arr10 = {1,2,3,4,5};
		
		
		System.out.println(Arrays.toString(optimized(arr10)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(redWhiteBlue(arr9)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(squareSort(arr8)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(stringNum(heights, names)));
		
		System.out.println();
		
		System.out.println(Arrays.toString(bubbleSortA(arr1)));

		System.out.println();
		
		System.out.println(Arrays.toString(bubbleSortD(arr1)));
	
		System.out.println();
		
		System.out.println(Arrays.toString(bubbleSortK(arr2, 4)));
		
		System.out.println();
		
		System.out.println(bubbleSort4(arr3));
		
		System.out.println();
		
		System.out.println(kthLargest(arr4, 3));
		
		System.out.println();
		
		System.out.println(Arrays.toString(oddSort(arr7)));
		
		
		
	}

}
