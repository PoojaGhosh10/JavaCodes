package BinarySearchCodes;

public class Ceiling {
	public static int findCeiling(int[] arr, int target) {//the smallest number greater or equal to the taget
		
		int start=0; 
		int end=arr.length-1;
		if(target>arr[end]) {
			return -1;
		}
		while(start<end) {
			
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,34,45,67,89,100};
		int target=90;
		int ceiling=findCeiling(arr, target);
		System.out.println(ceiling);
		

	}

}
