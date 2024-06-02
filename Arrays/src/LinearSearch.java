
public class LinearSearch {
	public static int linearSearch(int[]arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int target=4;
		int index=linearSearch(arr, target);
		if(index>-1) {
			System.out.println("The element is found at : " + index);
		}
		else {
			System.out.println("The element is not found in the array");
		}

	}

}
