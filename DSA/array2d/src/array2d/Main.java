package array2d;

import java.util.Scanner;

public class Main{

	/*
	 	Write a program to print all elements of a 2D
array. You need to declare and initialize a 2D array of
integers with predefined values. Use nested loops to
traverse through the array and print each element in a
matrix format (row by row).

	 */
	
	public static void print2DArray(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	User defined 2D Array
	 */
	
	public static int[][] user2DArray(){
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Enter the no. of Rows : ");
		
		int rows = objScanner.nextInt();
		
//		System.out.println();
		
		System.out.print("Enter no. of Columns : ");
		
		int col = objScanner.nextInt();
		
//		System.out.println();
		
		int [][]array = new int[rows][col];
		
		for (int i=0; i < array.length; i++) {
			
			for(int j=0; j < array[i].length; j++) {
				
				System.out.println("Enter value for [" + i +","+ j +"] : ");
				
				array[i][j] = objScanner.nextInt();
				
			}
			
		}
		
		return array;
	}

	
	
	/*
	 	Write a program to print the first and last row
of a 2D array.
	 */
	
	public static void print2DArrayFirstandLast(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			if (i==0 && i == arr.length-1) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}		
			
			}
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to print first and last column of
an array
	 */
	
	
	public static void print2DFirstandLastCol(int[][]matrix) {
		
		for(int r=0; r < matrix.length; r++) {
			
			for (int c = 0; c < matrix[r].length; c++) {
				
				if (c == 0 || c == matrix[r].length-1) {
					
					System.out.print(matrix[r][c] + " ");
					
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to print only diagonal
elements of an array
	 */
	
	public static void print2DArrayDiagonals(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(i == j && i + j == arr.length-1) 
				
				System.out.print(arr[i][j] + " ");
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to print all elements below the
major Diagonal of an array.
	 */
	
	public static void printUpperTriangularMatrix(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
							
				if(i < j) {
					System.out.print(arr[i][j] + " ");
				}
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to print all elements above the
major Diagonal of an array.

	 */
	
	public static void printLowerTriangularMatrix(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
							
				if(i > j) {
					System.out.print(arr[i][j] + " ");
				}
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to print all even elements of
an array.
	 */
	
	
	public static void printEvenElements(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
							
				if(arr[i][j] % 2 == 0) {
					System.out.print(arr[i][j] + " ");
				}
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	
	/*
	 	Write a program to multiply all elements of an
array by 10.
	 */
	
	
	public static void printDecadeElements(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
					
					System.out.print(arr[i][j]*10 + " ");
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	/*
	 	Write a program to replace all negative
elements of an array by 0 (zero).
	 */
	
	
	public static void replaceNegatives(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
					
					if (arr[i][j] < 0) {
						
						arr[i][j] = 0;
						
						System.out.print(arr[i][j] + " ");
					
					}
					else {
						System.out.print(arr[i][j] + " ");
					}
				
			}		
			
			System.out.println();
		}
		
	}
	
	
	
	/*
	 	 Write a program to swap first row with last
row.
	 */

	
	public static void swapRows(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
					
				if (i == 0) {
					
					int z = arr[i][j];
					arr[i][j] = arr[arr.length-1][j];
					arr[arr.length-1][j] = z;
					
					
				}
				
			}		
			
			print2DArray(arr);
		}
		
	}
	
	
	/*
	 	Write a program to swap first column with last
column.
	 */
	
	public static void swapCols(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
					
				if (j == 0) {
					
					int z = arr[i][arr.length-1];
					arr[i][arr.length-1] = arr[i][arr.length-1];
					arr[i][arr.length-1] = z;
					
					
				}
				
			}		
			
			print2DArray(arr);
		}
		
	}
	
	
	
	/*
	 	Write a program to sort each row of the array.
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
	
	
	public static void sortRows(int arr[][]) {
		
		for (int i = 0; i < arr.length; i++) {
			
			selectionSortA(arr[i]);
			
		}
		
		print2DArray(arr);
		
	}
	
	
	/*
	 	Write a program to sort each column of the
array.
	 */
	

	public static void sortCols(int arr[][]) {
			
		// enter values in array
		
		for (int i = 0; i < arr.length; i++) {
			
			int[]a = new int [arr.length];
						
			for (int j = 0; j < arr[i].length; j++ ) {
				
				a[j] = arr[j][i];
				
			}
			
			// sort
			
			selectionSortA(a);
				
			// enter again
			
			for (int k = 0; k < arr.length; k++) {

				arr[k][i] = a[k];
				
			}
			
		}
				
		print2DArray(arr);
		
	}
	
	
	/*
	 	Write a program to find sum of diagonal
elements in an array.

	 */
	
	
	public static int sumOfDiagonals(int [][]arr) {
		
		int sum=0;
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(i == j && i + j == arr.length-1) 
				
				sum += arr[i][j];
				
			}		
			
			System.out.println();
		}
		return sum;
	}
	
	
	/*
	 	Write a program to find the sum of each row
in a 2D array and store the results in another array with
1 column containing the sum of each row
	 */
	
	
	public static void sumRow(int[][]mat) {
		
		int[][]a = new int[mat.length][1];
		
		for (int i = 0; i < mat.length; i++) {
			
			int sum = 0;
			
			for (int j = 0; j < mat[i].length; j++) {
				
				sum += mat[i][j];
				
			}
			
			a[i][0] = sum;
			
		}
		
		print2DArray(a);
	}
	
	
	/*
	 	Write a program to find sum of each Columns
in an array and store the results in another array with 1
column containing the sum of each column.
	 */
	
	
	public static int[] sumColumn(int[][]mat) {
		
		int[]b = new int[mat.length];
		
		for (int i = 0; i < mat.length; i++) {
			
			int sum = 0;
			
			for (int j = 0; j < mat[i].length; j++) {
				
				sum += mat[j][i];
				
			}
			
			b[i] = sum;
			
		}
		return b;
	}
	
	
	
	/*
	 	Write a program to find the minimum element
in each row of a 2D array and print both the minimum
value along with its index (row and column).
	 */
	
	public static void minimumRowElement(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			int min = arr[i][0];
			int a = i;
			int b = 0;
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(min > arr[i][j]) {
				
					min = arr[i][j];
					a = i;
					b = j;
					
				}
				
			}		
			
			System.out.println("Minimum :" + min + " " + "Index :" + "(" + a + "," + b + ")");
			
			System.out.println();
		}
		
	}
	
	
	
	/*
	 	Write a program to find the maximum
element in each column of a 2D array and store its
value along with its index (row and column) in a new
array.
	 */
	
	
	
	public static void maximumColumnElement(int [][]arr) {
		
		for (int i =0; i < arr.length; i++) {
			
			int max = arr[i][0];
			int a = i;
			int b = 0;
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(max < arr[j][i]) {
				
					max = arr[j][i];
					a = i;
					b = j;
					
				}
				
			}		
			
			System.out.println("Maximum :" + max + " " + "Index :" + "(" + b + "," + a + ")");
			
			System.out.println();
		}
		
	}
	
	
	
	/*
	 	Write a program to find the maximum
element and the minimum element of all elements in a
2D array
	 */
	
	
	public static void minMaxElement(int [][]arr) {
		
		int min = arr[0][0];
		
		int max = arr[0][0];
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(max < arr[i][j]) {
				
				
					max = arr[i][j];
					
				}
				
				if( min > arr[i][j] ) {
					
					min = arr[i][j];
				}
				
			}		
			
			System.out.println();
		}
		
		System.out.println("Minimum is : " + min);
		
		System.out.println();
		
		System.out.println("Maximum is :" + max);
		
	}
	
	
	/*
	 	Write a program to count all even and odd
elements in a 2D array.
	 */
	
	
	public static void countEvenOdd(int [][]mat) {

		int counteven = 0;
		int countodd = 0;
		
		for (int i = 0; i < mat.length ; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] % 2 == 0) {
					
					counteven++;
					
				}
				else if(mat[i][j] % 2 != 0) {
					
					countodd++;
				}
				
			}
			
		}
		
		System.out.println("Even are : "+ counteven);
		
		System.out.println();
		
		System.out.println("Odd are : "+ countodd);
		
	}
	
	public static boolean binarySort2D(int[][]matrix, int target) {
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		int low = 0;
		int high = n * m - 1;
		int mid = (high + low)/2;
		
		while (low <= high) {
			
			int row = mid / m;
			int col = mid % m;
			
			if(matrix[row][col] == target) {
				
				return true;
			}
			
			else if (matrix[row][col] < target) {
				
				low = mid +1;
				
			}
			
			else if (matrix[row][col] > target){
				
				high = mid - 1;
				
			}
			
			
		}
		
		
		return false;
	}
	
	
/*
 	
	public static boolean optimizeApproach(int[][]matrix, int target) {
		
		int n = matrix.length;
		
		int m = matrix[0].length;
		
		int low = 0;
		
		int high = n * m - 1;
			
		while (low <= high) {
			
			int mid = m;
			
			int row = mid / m;
			
			int col = mid % m;
			
			if(matrix[row][mid] == target) {
				
				return true;
			}
			
			else if (matrix[row][mid] < target) {
				
				row--;
				
			}
			else if (matrix[row][mid] > target) {
				
				col--;
			}
			
		}
			
		return false;
	}
	
*/
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		int[][] arr = 
			{ 
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		
		
		int[][] arr2 = 
			{ 
				{11,2,3},
				{4,16,6},
				{7,82,55}
			};
		
		
		int [][] arr1 = 
			{
					{1,4,7,11,15},
					{2,5,8,12,19},
					{3,6,9,16,22},
					{10,13,14,17,24},
					{18,21,23,26,30}
			};
		
		
		
		
		
		System.out.println();
		
//		sumRow(arr1);
//		
//		System.out.println();
//		
//		sortCols(arr2);
//		
//		System.out.println();
//		
		maximumColumnElement(arr2);
//		
		System.out.println();
//		
		minimumRowElement(arr2);
		
		System.out.println();
		
		minMaxElement(arr2);
		
		System.out.println();
		
		countEvenOdd(arr);
		
		print2DFirstandLastCol(arr1);
		
		System.out.println();
		
		sortRows(arr2);
		
		System.out.println();
		
		print2DArray(arr);
		
		System.out.println();
		
		System.out.println(binarySort2D(arr, 5));
		
		System.out.println();
		
		
		SheetB.printSheet2();

		
		
	}

}


class SheetB extends Main {
	
	
	/*
	 	Write a program to search for a specific
element in a 2D array and print its value along with its
index (row and column) if found. If the element is not
found, display "Element not found".

	 */
	
	public static void LinearSearch2D(int [][]arr, int target) {
		
		int a = 0,b = 0;
		
		boolean flag = true;
		
		for (int i =0; i < arr.length; i++) {
			
			for (int j =0; j < arr[i].length; j++) {
				
				if(arr[i][j] == target) {
					
					flag = false;
					
					a = i;
					
					b = j; 
					
				}
		
				
			}		
			
		}
		
		if (flag) {
			
			System.out.println("Element not found");
			
		}
		
		System.out.println("Target "+ target + " found at " + "(" + a + "," + b + ")" );
		
	}
	
	
	/*
	 * Write a program to perform the addition of two
matrices. The program should take two 2D arrays of
the same size as input and output their sum matrix.
	 */
	
	
	public static void matrixAddition(int[][]a, int[][]b) {
		
		for (int i=0; i < a.length; i++) {
			
			for (int j =0; j < a.length; j++) {
				
				System.out.print( (a[i][j] + b[i][j]) + " ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	/*
	 	Write a program to perform the subtraction of
two matrices. The program should take two 2D arrays
of the same size as input and output their difference
matrix. If the matrices have different dimensions,
display an error message indicating that subtraction is
not possible.
	 */
	
	
	public static void matrixSubtraction(int[][]a, int[][]b) {
		
		if(a.length != b.length) {
			
			System.out.println("Subtraction is not possible");
			return;
			
		}
		
		
		for (int i=0; i < a.length; i++) {
			
			for (int j =0; j < a.length; j++) {
				
				System.out.print( (a[i][j] - b[i][j]) + " ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	/*
	 	Write a Java program to perform the
multiplication of two matrices. The program should
take two 2D arrays as input and output their product
matrix. If the matrices cannot be multiplied (i.e., the
number of columns in the first matrix is not equal to the number of rows in the second matrix), display an
error message indicating that multiplication is not
possible.
	 */
	
	
	public static void matrixMultiplication(int[][]a, int [][]b) {
		
		int o = a[0].length;
		
		int p = b.length;
		
		if (o != p) {
			System.out.println("Their product is not possible !!");
			return;
		}
		
		int m = a.length;
	
		int n = b[0].length;
			
		int[][]result = new int[m][n];
		
		for (int i = 0; i < a.length; i++) {
			
			int sum = 0;
			
			for (int j = 0, k = 0; k < b[0].length; j++) {
				
				sum += a[i][j] * b[j][k];
				
				if(j == 2) {
					
					result[i][k] = sum;
					
					j=-1;
					
					sum = 0;
					
					k++;
				}
			}		
		}
		print2DArray(result);
	}
	
	
	/*
	 	Write a program to perform snake traversal of
the given 2D matrix. Snake traversal of a matrix
involves traversing it in a zigzag manner. For example,
the first row is traversed left to right, the second row is
traversed right to left, and so on.
	 */
	
	
	public static void snake(int[][]a) {
		
		for(int i =0; i < a.length; i++) {
			
			if (i % 2 == 0) {
				
				for (int j = 0; j < a[i].length; j++) {
					
					System.out.print(a[i][j] + " ");
					
				}
				
			}
			else {
				
				for (int k = a.length-1; k>=0; k--) {
					
					System.out.print(a[i][k] + " ");
					
				}
				
			}
			
		}
		
	}
	
	
	
	/*
	 	Write a program to perform wave traversal of a
2D matrix. In wave traversal, you traverse the matrix in
a zig-zag pattern: first down the first column, then up
the second column, and so on, alternating between
down and up for each column.
	 */
	
	
	public static void colnSnake(int[][]a) {
		
		for (int i=0; i < a[0].length; i++){
			
			if(i % 2 == 0) {
			
				for(int j=0; j < a.length; j++) {
					
					System.out.print(a[j][i] + " ");
					
				}
				
			}
			
			else {
				
				for(int k= a.length-1; k >= 0; k--) {
					
					System.out.print(a[k][i] + " ");
					
				}
				
			}
			
		}
		
	}
	
	
	/*
	 	Write a program to perform the reverse wave
traversal of a 2D matrix. In reverse wave traversal, you
traverse the matrix starting from the last column. You
will first traverse the last column upwards, then the
second last column downwards, and so on, alternating
between up and down for each column.
	 */
	
	
	public static void colSnakeReverse(int[][]a) {
		
		for (int i = a.length-1; i >= 0; i--) {
				
				if(i % 2 != 0) {
					
					for (int j=a.length-1; j >=0; j--) {
						
						System.out.print(a[j][i] + " ");
						
					}
					
				}
				else {
					
					for (int k=0; k < a.length; k++ ) {
						
						System.out.print(a[k][i] + " ");
						
					}
					
				}		
			
		}
		
	}
	
	
	
	/*
	 	Write a program to perform a half diagonal
traversal of the given 2D array. Start from the leftmost
diagonal(traversal begins from the top-left corner) and
continue until all elements above and on the main
diagonal are covered.
	 */
	
	
	public static void diagonalPrint(int[][]a) {
		
		for(int k =0; k < a.length; k++) {
			
			for (int i =0, j = k ; j < a[k].length; i++, j++) {
					
					System.out.print(a[i][j] + " ");
				
			}
			
		}
		
	}
	
	
	/*
	 	Given a square matrix of order N*N, write code
to print all the elements in the order of their diagonal.
For example, in the below matrix, the elements should
be printed in the marked (in red) order, and the final
output should be as shown below:
	 */
	
	
	public static void risingStar(int[][]a) {
		
		for (int i = 0; i < a.length; i++) {
			
			// upper triangle and diagonal
			
			for (int j = 0, k = i; k >= 0; j++, k--) {
				
				System.out.print(a[k][j] + " ");
				
			}	
			
		}
		
		// lower triangle
		
		for (int c = 1; c < a.length ; c++) {
			
			for (int k = c, p = a.length-1; p >= c ; k++, p--) {
				
				System.out.print(a[p][k] + " ");
				
			}
			
		}
	
	}
	
	
	/*
	 	Write a program to perform a snake diagonal
zigzag traversal of a 2D array. The traversal should
alternate between upward and downward directions
for each diagonal.
	 */
	
	
	public static void snakeDiagonalZigzag(int[][]a) {
		

		for (int i = 0; i < a.length; i++) {
			
			// upper triangle and diagonal
			
			if(i % 2== 0) {
			
				for (int j = 0, k = i; k >= 0; j++, k--) {
					
					System.out.print(a[k][j] + " ");
					
				}	
				
			}
			else {
				
				for (int j = 0, k = i; k >= 0; j++, k--) {
					
					System.out.print(a[j][k] + " ");
					
				}
				
			}
				
			
		}
		
		// lower triangle
		
		for (int c = 1; c < a.length ; c++) {
			
			if (c % 2 != 0) {
			
				for (int k = c, p = a.length-1; p >= c ; k++, p--) {
					
					System.out.print(a[p][k] + " ");
					
				}
				
			}
			else {
				
				for (int k = c, p = a.length-1; p >= c ; k++, p--) {
					
					System.out.print(a[k][p] + " ");
					
				}
				
			}
			
		}
		
	}
	
	
	
	public static void spiral(int[][]arr) {
		
		int minr = 0;
		
		int minc = 0;
		
		int maxr = arr.length-1;
		
		int maxc = arr.length-1;
		
		int te = arr.length*arr.length;
		
		
		int count = 0;
		
		while(count <= te) {
			
			for(int i = minr, j = minc ; i <= maxr; i++) {
				
				System.out.print(arr[i][j] + " ");
				count++;
				
			}
			
			minc++;
			
			for(int i = minc, j = maxr ; i <= maxc; i++) {
				
				System.out.print(arr[i][j] + " ");
				count++;
				
			}
			
			maxr--;
			
			for(int i = maxr, j = maxc ; i >= minc; i--) {
				
				System.out.print(arr[i][j] + " ");
				count++;
				
			}

			maxc--;
			
			for(int i = maxc, j = minr ; i >= minr; i--) {
				
				System.out.print(arr[i][j] + " ");
				count++;
				
			}
			
			minr++;

		}
		
	}
	
	
	
	public static void ewns(int[][]a) {
		
		int dir = a[0][0];
		
		int i = 0;
		int j = 0;
		
		while(true) {
			
			dir = dir+a[i][j]%4;
			
			if(dir == 0) {
				
				j++;
				
			}
			
			else if(dir == 1) {
				
				i++;
				
			}
			
			else if (dir == 2) {
				
				j--;
				
			}
			else if(dir == 3) {
				
				i--;
				
			}
			
			if( i < 0) {
				
				i++;
				break;
				
			}
			
			else if( j < 0) {
				
				j++;
				
				break;
				
			}
			
			else if( i == a.length) {
				
				i--;
				break;
				
			}
			
			else if( j == a[0].length) {
				
				j--;
				break;
				
			}
					
		}
		
		System.out.println(i + " " + j);
		
	}
	
	
	public static void conversion(int[]a, int row, int col) {
		
		int [][]b = new int[row][col];
		
		int count = 0;
		
		for(int i = 0; i < b.length ; i++) {
			
			for(int j = 0; j < col; j++) {
				
				if(count < a.length) {
					
					b[i][j] = a[count];
					count++;
				}
				
				else {
					
					b[i][j] = -1;
					
				}
				
			}
			
		}
		print2DArray(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void printSheet2() {
		
		int[][]a = {
				
				{2,4,6},
				{8,10,12},
				{14,16,18}
				
		};	
		
		
		int[][]e = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		
		int[][]b = {
				
				{1,3,5},
				{7,9,11},
				{13,15,17}
				
		};
		
		int[][]c = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		
		
		int [][]d = {
				
				{2,3},
				{3,2},
				{5,9}
		};
		
		
		int[]f = {1,2,3,4,5};
		
		int[][]g = {
				
				{0,0,0,1},
				{0,1,0,0},
				{1,0,0,0},
				{0,1,0,1}
				
				
		};
		
		
		
//		System.out.println("Sheet 2 Questions");
//		
//		System.out.println();
//		
//		LinearSearch2D(a,16);
//		
//		System.out.println();
//		
//		matrixAddition(a, b);
//		
//		System.out.println();
//		
//		matrixSubtraction(a, b);
//		
//		System.out.println();
//		
//		snake(a);
//		
//		System.out.println();
//		
//		diagonalPrint(a);
//		
//		System.out.println();
//		
//		risingStar(c);
//		
//		System.out.println();
//		
//		colnSnake(a);
//		
//		System.out.println();
//		
//		colSnakeReverse(c);
//		
//		System.out.println();
//		
//		snakeDiagonalZigzag(c);
//		
//		System.out.println();
//		
//		spiral(c);
//		
//		System.out.println();
		
//		matrixMultiplication(d, a);
		
//		conversion(f, 3, 3);
		
//		ewns(g);
		
//		print2DArray(user2DArray());
	}
	
}

















