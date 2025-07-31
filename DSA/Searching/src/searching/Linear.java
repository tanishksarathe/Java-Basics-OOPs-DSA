package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
	

	public static void linearSearch(int[]a, int k) {
		
		for (int i=0; i < a.length; i++) {
			
			if (a[i] == k) {
				
				System.out.println(i);
				break;
			
			}
			
		}
		
	}
	
	/*
	 	Given an array of integers, write a program to find all
the elements in the array whose value is equal to their index.
The index starts from 0. If no such element exists, return -1.

	 */
	
	
	public static int[] q9(int[]a) {
		
		int count =0;
		
		boolean h = true;
		
		for (int i=0; i <a.length; i++) {
			
			if (a[i] == i) {
				count++;
				h = false;
			}
			
		}
		
		if (h) {
			count = 1;
		}
		
		int b[] = new int[count];
			
		int k =0;
		
		boolean flag = true;
		
		for (int j=0; j < a.length; j++) {
			
			if (a[j] == j) {
				b[k] = a[j];
				k++;
				flag = false;
			}
		}
		
		if (flag == true) {
			b[0] = -1;
		}
		
		return b;
	}
	
	
	public static int transition(int[]a) {
		
		for (int i =0; i < a.length; i++) {
			
			if (a[i] != 0) {
				
				return i;
				
			}
			
		}
		return 1;
	}
	
	
	public static int findFloor(int []x, int target){
		
		int s = -1;
		for (int i=0; i < x.length; i++) {
			
			if(x[i] > s && x[i] <= target) s = x[i];
			
		}
		return s;
	}
	
	
	
	public static int findCeiling(int[]a, int target) {
		
		int res = -1;
		
		for(int i =0; i < a.length; i++) {
			
			if(a[i] >= target && a[i] < a[i+1]);
			
		}
		return res;
	}
	
	
	public static void differencePair(int[]a, int target) {
		
		int b =0;
		int c = 0;
		
		int i = 0;
		while (i < a.length-1) {
			
			int j = i+1;
			while(j < a.length) {
				
				if(a[i] - a[j] == target || a[i] - a[j] == -1*(target)) {
					
					 b = a[i];
					 c = a[j]; 
					
				}
			j++;	
			}
			i++;
		}
		System.out.println("Pair is : " + b +","+ c);
	}
	
	
	
	/*
	 	
	 */
	
	public static int count(int[]a, int target) {
		
		int count = 0;
		
		for (int i=0; i < a.length; i++) {
			
			if(a[i] == target) count++;
			
		}
		return count;
	}
	
	
	public static int[] ques5(int[]a, int target) {

		int size = count(a, target);
		
//		System.out.println(size);
		
		int[]b = new int[size];
		
		boolean flag = true;
		
		int k = 0;
		
		for(int i=0; i < a.length; i++) {
			
			if(a[i] == target) {
				
				b[k] = i;
				k++;
			}
			
			flag = false;
		
		}
		
		if(flag) b[0] = -1;
		
		return b;
		
	}
	
	
	
	public static boolean findNegative(int[]a) {
		
		for(int i =0; i < a.length; i++) {
			
			if(a[i] < 0) return true;
			
		}
		return false;
	}
	
	
	
	public static int findChar(char[]a, char c) {
		
		for(int i =0; i < a.length ; i++) {
			
			if (a[i] == c) return i;
			
		}
		return -1;
	}
	
	
	
	public static int findConsecutive(int[]a) {
		
		int count = 0;
		return count;
		
	}

	
	
	public static void main(String[] args) {
			
		int[]arr = {0,2,3,7,4};
		
		int[]arr2 = {0,0,0,0,1,1,1,1};
		
		int[]arr1 = {5,10,15,20};
		
		int []arr3 = {5,16,7,11,15};
		
		int[]arr4 = {5,20,3,2,50,80};
		
		int[]arr5 = {1,2,3,4,2,5,2};
		
		char[]arr6 = {'a','b','c','d','c'};
		
		int[]arr7 = {1,2,4,5,6};

		int[]arr8 = {5,10,15,20};
		
//		System.out.println(findChar(arr6, 'c'));
//		
//		System.out.println();
		
//		System.out.println(findFloor(arr3, 3));
//		
//		System.out.println();
//		
//		System.out.println(Arrays.toString(q9(arr)));
//		
//		System.out.println();
//		
//		System.out.println(transition(arr2));
//
//		System.out.println();
//		
//		differencePair(arr4, 78);
//		
//		System.out.println();
//		
//		System.out.println(Arrays.toString(ques5(arr5, 2)));
//		
//		System.out.println();
	
		System.out.println(Arrays.toString(q9(arr8)));
		
		
		
	}

}
