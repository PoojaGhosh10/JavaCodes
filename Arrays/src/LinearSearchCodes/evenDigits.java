package LinearSearchCodes;

public class evenDigits {
	public static int[] evendigits(int[]arr) {
		int k=0;
		int[] nums=new int[k];
		for(int ele:arr) {
			int count=countdigits(ele);
			if(even(count)) {
				nums[k++]=ele;
			}
		}
		return nums;//can return the count of total elements
	}
	public static int countdigits(int element) {
		int count=0;
		while(element>0) {
			count++;
			element/=10;
		}
		return count;
	}
	public static boolean even(int count) {
		return count%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {243,4563,79976,36746,342512,8892363};
		int[]nums=evendigits(arr);
		System.out.println("The array of even digits are: " +nums);


		}

}
