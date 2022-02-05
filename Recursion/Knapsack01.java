class Knapsack01{

    public static int findMaxValue(int[] wt, int[] val, int W, int wtSize){

    	if(W == 0 || wtSize == 0){
    		return 0 ;
    	}
        int value = 0 ;
    	if(wt[wtSize - 1] <= W){
    	  value = Math.max(val[wtSize - 1] + findMaxValue(wt , val, W - wt[wtSize - 1], wtSize - 1),
    					findMaxValue(wt , val, W , wtSize - 1)) ;
    	}

    	return value ;
    }

	public static void main(String[] args){
		int[] wt = {10,20,30} ;
		int[] value = {60,100,120} ;
		int W = 50 ;
		int wtSize = wt.length ;

		int maxValue = findMaxValue(wt, value, W, wtSize) ;
		System.out.println(maxValue) ;
 	}
}