package BinarySearchCodes;

import java.util.Arrays;

//first and last position of the element repeated multiple times in a sorted array.
public class FirstandLastPosition {
	public static int findPosition(int[] arr, int element,boolean position) {
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(element>arr[mid]) {
				start=mid+1;
			}
			else if(element<arr[mid]) {
				end=mid-1;
			}
			else {
				ans=mid;
				if(position) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,3,4,5,6,6,6,6,6,6,7,8,9};
		int element=6;
		int[] getPosition= {-1,-1};
		getPosition[0]=findPosition(arr, element,true);
		if(getPosition[1]!=-1) {
			getPosition[1]=findPosition(arr, element,false);
		}
		else {
			getPosition[1]=getPosition[0];
		}
		System.out.println(Arrays.toString(getPosition));
	}

}
