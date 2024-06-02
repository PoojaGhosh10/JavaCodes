package Matrices;

import java.util.Arrays;

public class completeSorted {
	    public static void findFirstRepeatedElement(int[]arr,int size){
	        int i;
	        Arrays.sort(arr);
	        System.out.print(" \nRepeating elements are ");
	        for(i=1;i<size;i++) {
	        	if(arr[i]==arr[i-1]) {
	        		System.out.println(arr[i]);
	        		
	        	}
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr={6,6,6,3,4,6,7,8,9,9,9,9,9,10};
	        findFirstRepeatedElement(arr, arr.length);
	    }
}
