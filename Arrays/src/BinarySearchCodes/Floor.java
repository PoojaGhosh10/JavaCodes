package BinarySearchCodes;

public class Floor {
	public static int findFloor(int[] arr, int target) {
		int start=0; 
		int end=arr.length-1;
		if(target>arr[end]) {
			return -1;
		}
		while(start<end) {
			
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return arr[mid];
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return arr[end];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,34,45,67,89,100};
		int target=90;
		int findfloor=findFloor(arr, target);
		System.out.println(findfloor);
	}
}
