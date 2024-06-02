
public class BinarySearch {
	public static int search(int[]arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;//answer found
			}//the array is sorted so either element is in left or right if not in mid
			else if(target>arr[mid]) {//check in the right side: change the start to mid +1 and end value remains the same.
				start=mid +1;//mid +1 because mid is already found to be false so next element after that
			}
			else {
				end=mid-1;//checking the left side
			}
			
		}
		//if element was found in the array it would have written from the while loop not reached till this position so
		//when element is not found in the loop it terminates at a condition where start=mid and end=start+1.so return negative index.
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int target=45;
		int index=search(arr,target);
		if(index>-1) {
		System.out.println("The element is found at : " + index);
		}
		else {
			System.out.println("The element is not found in the array");
		}
	}

}
