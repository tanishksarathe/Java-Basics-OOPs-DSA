package sortingAlgorithms;

import java.util.Arrays;

public class Merge {
	
	public static int[] mergeSort(int[]arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		arr = mergeSortRec(arr, left, right);

		return arr;
	}
	
	
	public static int[] mergeSortRec(int[]arr, int left, int right) {
		
		if (left < right) {
			
			int mid = left + (right - left)/2;
			
			mergeSortRec(arr, left, mid );
			
			mergeSortRec(arr, mid+1, right);
			
		   arr = conquer(arr, left, mid, right);		
			
		}
		return arr;
	}
	
	
	public static int[] conquer(int[] arr, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		
		int n2 = right - (mid);
		
		int[]leftArray = new int[n1];
		
		int[]rightArray = new int[n2];
		
		for (int i=0; i < n1; i++) {
			
			leftArray[i] = arr[left +i];
			
		}
		
		for (int j=0; j < n2; j++) {
			
			
			rightArray[j] = arr[mid - j + 1];
			
		}
		
		
		return mergedSortedArray(leftArray, rightArray, arr);
			
	}
	
	
	public static int[] mergedSortedArray(int[]a, int[]b, int[]c) {
		
		int i=0;
		
		int j=0;
		
		int k = 0;
		
		while (i < a.length && j < b.length) {
			
			if(a[i] < b[j]) {
				
				c[k] = a[i];
				i++;
			}
			
			else if (b[j] < a[i]) {
				
				c[k] = b[j];
				j++;
			}
			
			
			k++;
		}
		
	
		
		while (i < a.length) {
			
			i++;
			k++;
		}
		
		
		while (j < b.length) {
			
			j++;
			k++;
		}
		
		
		return c;
	}
	

	public static void main(String[] args) {
		
		int[]arr1 = {6,2,11,7,5,4};
		
		
		System.out.println(Arrays.toString(mergeSort(arr1)));
	}

}
