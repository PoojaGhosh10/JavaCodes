package BinarySearchCodes;

//public class findPositionInfiniteArray {
//	public static int ans(int[] arr, int target) {
//        // first find the range
//        // first start with a box of size 2
//        int start = 0;
//        int end = 1;
//
//        // condition for the target to lie in the range
//        while (target > arr[end]) {
//            int temp = end + 1; // this is my new start
//            // double the box value
//            // end = previous end + sizeofbox*2
//            end = end + (end - start + 1) * 2;
//            start = temp;
//        }
//        return findPosInfiniteArray(arr, target, start, end);
//        
//	public static int findPosInfiniteArray(int[] arr) {
//			int start=0;
//			int end=arr.length-1;
//			int ans=-1;
//			while(start<end) {
//				int mid=start+(end-start)/2;
//				if(element>arr[mid]) {
//					start=mid+1;
//				}
//				else if(element<arr[mid]) {
//					end=mid-1;
//				}
//				else {
//					ans=mid;				}
//			}
//			return ans;
//		}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}
//
//}
