import java.util.Arrays ;

class Knapsack01{

    public static int findMaxValue(int[] wt, int[] val, int W, int wtSize,int[][] dp){

    	if(W == 0 || wtSize == 0){
    		return 0 ;
    	}
        if(dp[wtSize][W] != -1)
        	return dp[wtSize][W] ;
    	if(wt[wtSize - 1] <= W){
    	  dp[wtSize][W] = Math.max(val[wtSize - 1] + findMaxValue(wt , val, W - wt[wtSize - 1], wtSize - 1 , dp),
    					findMaxValue(wt , val, W , wtSize - 1 , dp)) ;
    	}

    	return dp[wtSize][W] ;
    }

	public static void main(String[] args){
		int[] wt = {10,20,30} ;
		int[] value = {60,100,120} ;
		int W = 50 ;
		int wtSize = wt.length ;
		int[][] dp = new int[wtSize + 1][W + 1];
		for(int[] row : dp)
		  Arrays.fill(row,-1) ;

		int maxValue = findMaxValue(wt, value, W, wtSize,dp) ;
		System.out.println(maxValue) ;
 	}
}