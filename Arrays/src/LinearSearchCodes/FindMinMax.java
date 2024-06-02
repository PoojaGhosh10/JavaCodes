package LinearSearchCodes;

public class FindMinMax {
	public static int findMin(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int ele:arr) {
			if(min>ele) {
				min=ele;
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int ele:arr) {
			if(max<ele) {
				max=ele;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int min=findMin(arr);
		int max=findMax(arr);
		System.out.println("The minimum element in the array is:" + min);
		System.out.println("The maximum element in the array is:" + max);
	}

}
