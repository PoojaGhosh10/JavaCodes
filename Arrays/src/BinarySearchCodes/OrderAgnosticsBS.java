package BinarySearchCodes;

public class OrderAgnosticsBS {
	public static boolean checkOrder(int[] arr) {
		int start=0;
		int end=arr.length-1;
		return arr[start]<arr[end];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1= {1,2,3,4,5,6,7,8,9,10};
		int[] arr2= {10,9,8,7,6,5,4,3,2,1};
		//for checking if the order is ascending
		boolean result1=checkOrder(arr2);
		if(result1) {
			System.out.println("The array is in ascending order");
		}
		else {
			System.out.println("The array is in descending order");
		}

	}

}
