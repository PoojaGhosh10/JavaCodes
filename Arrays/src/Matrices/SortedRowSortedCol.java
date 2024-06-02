package Matrices;

import java.util.Arrays;

public class SortedRowSortedCol {
	public static int[] findPosition(int[][]arr,int target){
		int startRow=0;
		int startcol=arr[0].length-1;
		while(startRow<=arr.length-1 && startcol>=0) {
			if(target==arr[startRow][startcol]) {
				return new int[] {startRow,startcol};
			}
			else if(target<arr[startRow][startcol]) {
				startcol--;
			}
			else {
				startRow++;
			}
		}
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
		int target=34;
		int[] pos= findPosition(arr,target);
		if(pos[0]>-1) {
		System.out.println("Element found at position:" + Arrays.toString(pos));
		}
		else {
			System.out.println("Element not found " + Arrays.toString(pos));
		}
	}

}
