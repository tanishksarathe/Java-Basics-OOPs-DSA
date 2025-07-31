package leetcode;

import java.util.Arrays;

public class Main {

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

	
	public static void main(String[] args) 
	{
		int[]a = {1,2,5};
		int[]b = {6,7};
		
		System.out.println(Arrays.toString(mergeArray(a,b)));
		
	}

}
