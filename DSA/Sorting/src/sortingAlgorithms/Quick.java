package sortingAlgorithms;

public class Quick {
	
	
	public static void quickSort(int[]arr, int low, int high) {
		
		if (low <high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			
			quickSort(arr, pi+1, high);
			
		}
		
	}
	
	
	public static int partition(int[]arr, int low, int high) {
		
		int pivot = arr[high];
		
		int i = (low -1);
		
		for (int j = low; j < high; j++) {
			
			if (arr[j] <= pivot) {
				
				i++;
				swap(arr, i, j);
				
			}

		}
		
		swap(arr, i+1, high);
		
		return i+1;
		
	}
	
	
	public static void swap(int[]a, int i, int j) {
		
		int z = a[i];
		a[i] = a[j];
		a[j] = z;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {8,5,3,4,2};
		
		quickSort(arr, 0, arr.length-1);
		
	}

}
