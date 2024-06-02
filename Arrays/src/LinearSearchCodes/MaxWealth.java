package LinearSearchCodes;

public class MaxWealth {
	public static int maximumWealth(int[][] accounts) {
		int maxWealth=Integer.MIN_VALUE;
        for(int customer=0; customer<accounts.length; customer++){
            int sum=0;
            for(int bank=0; bank< accounts[customer].length; bank++){
                sum+=accounts[customer][bank];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]accounts= {{1,2,3},{4,5,6},{7,8,9}};
		int maxWealth=maximumWealth(accounts);
		System.out.println(maxWealth);
	}
}
