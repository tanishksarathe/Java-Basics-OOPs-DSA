package searching;

public class Binary {

	public static int binarySearch(int[] a, int target) {

		return binarysearchrec(a, 0, a.length - 1, target);

	}

	public static int binarysearchrec(int[] a, int left, int right, int target) {

		if (left <= right) {
			int mid = (left + right) / 2;

			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {

				return binarysearchrec(a, left, mid - 1, target);

			} else {
				return binarysearchrec(a, mid + 1, right, target);
			}

		}

		return -1;

	}

	/*
	 * Given an array arr of positive integers sorted in a strictly increasing
	 * order, and an integer k. Return the kth positive integer that is missing from
	 * this array
	 */

	public static int ques6(int[] a, int k) {
		int count = 0;
		int missing = 0;

		int j = 1;
		int i = 0;
		while (i < a.length) {

			if (a[i] != j) {
				count++;
				j++;
				if (count == k) {
					missing = j - 1;
					break;
				}
			} else {

				if (i == a.length - 1 && count < k) {

					missing = a[i] + k - count;
					break;
				}

				i++;
				j++;
			}

		}

		return missing;
	}
	
	
	
	/*
	 		Given a m x n matrix grid which is sorted in nonincreasing order both row-wise and column-wise,
return the number of negative numbers in grid.
	 */
	
	
	public static int ques7(int[][]a) {
		
		int ans = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				if(a[i][j] < 0) {
					ans+=1;
				}
				
			}
			
		}
		return ans;
	}
	

	public static void main(String[] args) {

		int arr[] = { 2, 4, 8, 12, 16, 23, 38, 56 };

		int[] arr1 = { 1, 2, 3, 4 };
		
		int[][]arr2 =
			{
					{4,3,2,-1},
					{3,2,1,-1},
					{1,1,-1,-2},
					{-1,-1,-2,-3}
			};

		System.out.println(binarySearch(arr, 16));

		System.out.println();

		System.out.println(ques6(arr1, 2));
		
		System.out.println();
		
		System.out.println(ques7(arr2));

	}

}
