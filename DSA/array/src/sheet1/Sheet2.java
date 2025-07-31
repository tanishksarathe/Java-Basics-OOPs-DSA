package sheet1;

import java.util.Arrays;

public class Sheet2 extends Main {
	
	/*
	 		Write a program to swap two elements of an
array at given indices i and j.
	 */
	
	
	public static void swap(int []a, int b, int c) {
		
		int d;
		
			d =	a[b];
			a[b] = a[c];
			a[c] = d;
				
		System.out.println(Arrays.toString(a));
		
	}
	
	
	/*
	 	Write a Java program to reverse an array
using the swapping technique
	 */
	
	
	
	public static void swaprev(int []a) {
		
		int y,z;
		
		int i=0;
		while(i < (a.length-i-1)) {
			 
			y= a.length-i-1;
			
			z = a[i];
			a[i] = a[y];
			a[y] = z;
			i++;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	/*
	 	Write a Java program to swap the portion of
the array after the given index k. The portion of the
array starting from index k+1 to the end should be
reversed.
	 */
	
	public static void rev(int[]a,int b, int c) {
		
		 c = a.length-1;
		 int z;

		 int  i = b+1;
		 while (i < c) {
			 
			 z = a[i];
			 a[i] = a[c];
			 a[c] = z;
			 
			 i++;
			 c--;
			 
		 }
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void swapthree(int []a, int k) {
		
		
		rev(a, k, a.length);
		
		System.out.println(Arrays.toString(a));
	}

	
	/*
	 	Write a program to return the second
largest element from the array. If the second largest
element doesn't exist then return -1.
	 */
	
	public static void secondLargest(int []a) {
		
		int max =0;
		int max2 = 0;
		
		for (int i=0; i < a.length; i++) {
			
			if (a[i] > max) {
				max = a[i];
			}
		}	
		
		a[0] = max;
		
			for (int j = 0; j < a.length; j++) {

				if (a[j] > max2 && a[j] <= a[0] && a[j] != a[0]) 
				{
					max2 = a[j];
				}	
				else {
					max2 = -1;
				}
				
			}
		a[1] = max2;	
			
		System.out.println(a[1]);
	}
	
	
	/*
	 	Write a program to return the second smallest
element from the array. If the second smallest element
doesn't exist, return -1.
	 */
	
	public static void secondSmallest(int []a) {
		
		int min = a[0];
		
		for (int i=0; i < a.length; i++) {
			
			if (a[i] < min) {
			 min = a[i];
			}
		}	
		
		a[0] = min;
		
		int min2 = a[1];
		
			for (int j = 0; j < a.length; j++) {

				if (a[j] < min2 && a[j] >= a[0] && a[j] != a[0]) {
				 min2 = a[j];
				}	
				else {
					min2 = -1;
				}
				
			}
		a[1] = min2;	
			
		System.out.println(a[1]);
	}
	
	/*
	 Write a program to rotate an array to the left
by 1 position. The first element of the array should
move to the last, and all other elements should shift
one position to the left

	 */
	
	public static int[] revret(int[]a,int b, int c) {
		
		 int z;

		 int  i = b;
		 while (i < c) {
			 
			 z = a[i];
			 a[i] = a[c];
			 a[c] = z;
			 
			 i++;
			 c--;
			 
		 }
		return a;
	}
	
	
	public static void leftShift(int []c, int k) {
	
		
		c = revret(c, 0, k-1);
		
//		System.out.println(Arrays.toString(c));
		
		c = revret(c, k, c.length-1);
		
//		System.out.println(Arrays.toString(c));
		
		c = revret(c, 0, c.length-1); 
		
		
		System.out.println(Arrays.toString(c));
	}
	
	
	/*
 	Write a program to rotate an array to the right
by 1 position. The last element of the array should
become the first, and all other elements should shift
one position to the right.

 */
	
	public static void rightShift(int []c, int k) {
		
		
		c = revret(c, 0, c.length-k-1);
		
//		System.out.println(Arrays.toString(c));
		
		c = revret(c, c.length-k, c.length-1);
		
//		System.out.println(Arrays.toString(c));
		
		c = revret(c, 0, c.length-1); 		
		
		System.out.println(Arrays.toString(c));
	}
	
	
	
	
	/*
	 * Selection Sort (Ascending Order)
	 */
	
	public static int[] selectionSort(int []a) {
		
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
	 		Write a program to return the kth smallest
element from an array. If the array has less than k
distinct elements, return -1.
	 */
	
	public static int kthSmallest(int[]a, int n) {
		
		a = selectionSort(a);
		
		a = removeDuplicate(a);
		
		for (int i =0; i < a.length; i++) {
			
			if (i == (n-1)) {
				
				return a[i];
			}
			
		}
		
		return -1;
	}
	
	
	
	/*
	 	Write a program to return the kth largest
element from an array. If the array has less than k
distinct elements, return -1.

	 */
	
	public static int kthLargest(int[]a, int n) {
		
		a = selectionSort(a);
	
		a = removeDuplicate(a);
		
		for (int i =a.length-1; i >= 0; i--) {
			
			if (i == a.length-n) {
				
				return a[i];
			}
			
		}
		
		return -1;
	}
	
	
	/*
	 	Write a program to check if an array of integers
is sorted in non-decreasing order. If the array is sorted,
print true; otherwise, print false.
	 */
	
	public static boolean ques8(int[]a) {
		
		int[]b = new int[a.length];
		
		b = selectionSort(a);
		
		if (a == b) {
			return true;
		}
		
		return false;
		
	}
	
	
	
	/*
	 	Write a program to count the number of unique
elements in an array of integers, including duplicates.
	 */
	
	
	public static int unique(int []a) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
	          
			boolean counted = false;

	    for (int j = 0; j < i; j++) {
	                
	    	if (a[i] == a[j]) {
	                    
	    		counted = true;
	                    
	    		break;
	                
	    	}
	        
	    }

	    if (!counted) {
	    	count++;
	    }
	   
	}
		
		return count;
		
	}
	
	
	
	/*
	 	Write a program to remove duplicates from an
array and print the new array containing only unique
elements.
	 */
	
	public static boolean checkDuplicate(int j, int[]a) {
		
		for (int i=0; i < j; i++) {
			
			if(a[i] == a[j]) return true;
		}
		
		return false;
	}
	
	
	
	public static int[] removeDuplicate(int[]a) {
	
		int size = unique(a);
		
//		System.out.println(size);
		
		int []b = new int[size];
		
		int k=0;
		
		for (int i=0; i < a.length; i++) {
			
			if(checkDuplicate(i, a)) {
				continue;
			}
			else {
				
				b[k] = a[i];
				k++;
			}
		}
		
		return b;
		
	}
	
	/* Move Zero*/
	
	public static int[] moveZero(int[]a) {
		
		int z;
		
		for (int i =0; i < a.length; i++) {
			
			if (a[i] != 0) {
				continue;
			
			}
			
			else {
				
				for (int j =i+1; j < a.length; j++) {
					
					if (a[j] !=0) {
						
						z = a[i];
						a[i] = a[j];
						a[j] = z;
						
						break;
					}
					else {
						continue;
					}
					
				}
				
			}
			
		}
		return a;
	}
	
	
	/*
	 * move zero Single Loop
	 */
	
	public static int[] aaa(int[]a) {
		
		int z;
		
		int k =0;
		
		for (int i=0; i < a.length; i++) {
			
			if (a[i] !=0) {
				
				z=a[i];
				a[i] = a[k];
				a[k] = z;
				
				
				k++;
			}
			
		}
		return a;
	}
	
	
	/////// move negative
	
	public static int[] posNeg(int[]a) {
		
		int[]b = new int[a.length];
		
		int count = countPos(a);
		
		int k = 0;
		int g= a.length-count+1;
		
		for (int i =0; i < a.length; i++) {
			
			if(k==g) {
				revret(a, g, a.length-1);
			}
			
			if (a[i] >= 0) {
				b[k] = a[i];
				k++;
			}	
			else{
				b[g] = a[i];
				g++;
			}
			
		}
		
		return b;
	}
	
	
	public static int countPos(int []a) {
		
		int count=0;
		
		for (int i=0; i < a.length; i++) {
			
		if(a[i]>=0) {
			
			count++;
		
		}
		
		}
		
		return count;
	}
	
	///////
	


	/*
	 	Write a program that takes two arrays as input
and merges them into a single array.
The program should return the new merged array
containing all elements from the first array followed by
all elements from the second array.
	 */
	
	public static int[] mergeArray(int []a, int[]b){

        int size = a.length + b.length;

        int[]merged = new int[size];

            for (int i=0; i < merged.length; i++){

                if (i < a.length){
                    merged[i] = a[i];
                }
                else {
                    merged[i] = b[i - a.length];
                }

            }

        return merged;
    }

	
	
	/*
	 		Given two sorted arrays a[] and b[], where each
array may contain duplicate elements, the task is to
return the array of elements in the union of the two
arrays in sorted order. The union should only contain
distinct elements, even if an element appears multiple
times in the arrays.
	 */
	
	
	public static int[] mergeDuplicateSort(int[]a, int[]b) {
		
		return selectionSort(removeDuplicate(mergeArray(a, b)));
		
	}
	
	
	/*
	 	Given an array nums[] containing n distinct
numbers in the range [0, n], return the only number in
the range that is missing from the array.
The array contains all numbers from 0 to n except one.
Your task is to find the missing number efficiently.

	 */
	
	
	public static void findMissing(int[]a) {
		
		int max = maximum(a);
		
		for (int i=0; i < max; i++) {
			
			boolean flag = false;
			
			for (int j=0; j < max; j++) {
				
				if (a[j] == i) flag = true;
								
			}
			if (!flag) {
				System.out.println(i + "is missing");
			}
		}
		
	}
	
	
	/*
	 		Given a binary array nums, return the
maximum number of consecutive 0's in the array.
	 */
	
	public static int findConsecutive(int[]a, int n) {
		
		int count = 0;
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == n) {
				count++;
				if (count > max) {
					max = count;
				}
			}
			else {
				count = 0;
			}
		}
		return max;
	}
	
	
	/*
	 	You are given array of integers, nums, where
every element appears twice except for one. Your task
is to return the element that appears only once.

	 */

	public static int singleValue(int[]a) {
		
		int n = 0;
		
		for(int i=0; i < a.length; i++) {
			
			int count =0;
			
			for (int j =0; j < a.length; j++) {
				
				if (a[i] == a[j]) count++;
				
			}
			
			if (count == 1) {
				n = a[i];
			}
			
		}
		return n;
	}
	
	
	/*
	 	Given an array arr. Find the majority element
in the array. If no majority exists, return -1. A majority
element in an array is an element that
appears strictly more than arr.size() / 2 times in the
array.
	 */
	
	public static int majority(int[]a) {
		
		int n=0;
		
		int max =0;
		
		for (int i=0; i < a.length; i++) {
		
			int count=0;
			
			for (int j =0; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					count++;
					if (count > max) {
						max = count;
						n = a[i];
					}
				}
				
			}
			
		} 
		return (max > a.length/2) ? n : -1;
	}
	
	
	
	
	
	/* Sorting Algorithms */
	
	public static int[] bubbleSort (int []a) {
		
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
	 	Write a program to swap the contents of two
arrays of the same length. After the swap, the contents
of the first array should become those of the second
array and vice versa.
	 */
	
	public static void swapArrays(int[]a, int[]b) {
		
		int z;
		
		for (int i=0; i < a.length; i++) {
			
			z = a[i];
			a[i] = b[i];
			b[i] = z;
			
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		
		System.out.println(Arrays.toString(b));
		
	}
	
	
	/*
	 	Write a program to find the peak element in
an unsorted array.
	 */
	
	public static int peak(int[]a) {
		
		int p=0;
		
		for (int i=0; i < a.length; i++) {
			
			if (i == 0) {
				if (a[i] > a[i+1] && a[i] > p) {
					
					p = a[i];
				}
			}
			
			else if(a[i] > a[i-1] && a[i] > a[i+1] && a[i] > p) {
				p = a[i];
			}
			
			else if(i == a.length-1) {
				
				if (a[i] > a[i-1] && a[i] > p) {
					p = a[i];
				}
				
			}
			
		}
		return p;
	}
	
	
	
	/*
	 	Given an array arr[] of size n, the task is to find
all the Leaders in the array. An element is a Leader if it
is greater than all the elements to its right side.
	 */
	
	public static boolean leader(int[]a, int j) {
		
		for (int i=a.length-1; i > j; i-- ) {
			
			if (a[i] > a[j]) {
				
				return false;
				
			}
		}
		return true;
	}
	
	
	
	public static void leaders(int []a) {
		
		for (int i=0; i < a.length; i++) {
			
			if (leader(a, i)) System.out.print(a[i] + " ");
			
		}
		System.out.print("is/are leader/s.");
	}
	
	
	/*
	 	Given an array of integers nums and an integer
target, return the indices of the two numbers such that
they add up to the target.
You may assume that each input would have exactly
one solution, and you may not use the same element
twice.
You can return the answer in any order.

	 */
	
	public static void findTarget(int[]a, int t) {
		
		for (int i =0; i < a.length; i++) {
			
			for (int j =i+1; j < a.length; j++) {
				

				if (j==i) {
					continue;
				}
				else {
					if (a[j] + a[i] == t) System.out.print("[ " + i + " , " + j + " ]");
				}
				
				
			}
		}
		
	}
	
	
	/*
	 	 Given an array of integers of size N, the task is
to find the first non-repeating element in this array.
	 */
	
	public static int nonRepeat(int[]a) {
		
		int n=-1;
		
		for (int j =0; j < a.length; j++) {
			
			int count=0;
			
			for (int i=0; i < a.length; i++) {
				
				if(a[j] == a[i]) count++;
				
			}
			if (count == 1) {
				n = a[j];
				break;
			}
		}
		
		
		return n;
	}
	
	
	/*
	 		Given an array arr[] containing integers and an
integer k, your task is to find the length of the longest
subarray where the sum of its elements is equal to the
given value k. It is guaranteed that a valid subarray
exists.

	 */
	
	public static int subArray(int []a, int k) {
		
		
		int max =0;
		int index1 =0;
		int index2 =0;
		
		for (int i=0; i < a.length; i++) {
			
			int sum =0;
			
			for (int j =i; j < a.length; j++ ) {

				sum = sum + a[j];
				if (sum == k) {
					index1 = i;
					index2 = j;
					if ((index2 - index1) > max) {
						max = (index2 - index1);
					}
					
				}
			}
			
		}
		return max+1;
	}
	
	
	
	public static void main(String[] args) {
		
		int []arr = { 10,20,30,40,50,60};
		
		int []arr3 = {12,5,35,10,34,1};
		
		int []arr2 = {1,2,3,8,7,5,4,0};
		
		int []arr4 = {1,2,3,4,5};
		
		int []arr5 = {1,9,5,7,45,63,25,25};
		
		int arr6[] = {20,20,30,30,10,40,40,40};
		
		int []arr7 = {2,4,6,8};
		
		int []arr8 = {8,0,0,1,0,5};
		
		int []arr9 = {0,1,2,0,5,0};
		
		int []arr10 = {-4,3,6,8,-1,-2,6,9,-3,9,-8};
		
		int[]arr11 = {0,0,1,2,3,0,4,0,1,0,0,0,0,4,4,4,4,4,4,5,5,5,9,9,9};

		int arr12[] = {1,1,2,1,3,5,1};
		
		int arr13[] = {10,20,15,2,23,90,67};
		
		int []arr14 = {16,17,4,3,5,2};
		
		int[]arr15 = {3,2,1,3};
		
		int []arr16 = {10,5,2,7,1,9};
		
		
		System.out.println(subArray(arr16, 15));
		
		System.out.println();
		
		System.out.println(nonRepeat(arr6));
		
		System.out.println();
		
		findTarget(arr15, 6);
		
		System.out.println();
		
		leaders(arr14);
		
		System.out.println();
		
		System.out.println(peak(arr13));
		
		System.out.println();
		
		swapArrays(arr8, arr9);
		
		System.out.println();
		
		System.out.println(majority(arr12));
		
		System.out.println();
		
		System.out.println(singleValue(arr6));
		
		System.out.println();
		
		System.out.println(Arrays.toString(mergeDuplicateSort(arr4, arr7)));
		
		System.out.println();
		
		System.out.println(findConsecutive(arr11, 4));
		
		System.out.println();
		
		findMissing(arr2);
		
		System.out.println();
		
		System.out.println(unique(arr11));
		
		System.out.println();
//		
		System.out.println(Arrays.toString(moveZero(arr8)));
//		
		System.out.println();
		
		System.out.println(Arrays.toString(posNeg(arr10)));
		
		System.out.println();
		
		swap(arr, 1, 3);
//		
		System.out.println();
//		
		swaprev(arr);
//		
		System.out.println();
//		
		swapthree(arr2,2);
//
		System.out.println();
//		
		secondLargest(arr3);
//		
		System.out.println();
//		
		secondSmallest(arr3);
//		
		System.out.println();
		
		leftShift(arr4, 1);
//		
		System.out.println();
//		
		rightShift(arr4, 1);
//		
		System.out.println();
		
		System.out.println(ques8(arr4));
		
		System.out.println();
		
		System.out.println(kthLargest(arr5, 4));
		
		System.out.println();
		
		System.out.println(kthSmallest(arr16, 3));
		
		System.out.println();
		
		System.out.println(Arrays.toString(removeDuplicate(arr6)));

		System.out.println();
		
		System.out.println(Arrays.toString(mergeArray(arr, arr4)));
		
		
	}

}
