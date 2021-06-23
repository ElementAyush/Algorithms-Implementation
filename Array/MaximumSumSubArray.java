class MaximumSumSubArray{
	public static void main(String[] args){

		int[] array = new int[]{-1,9,-6,5,4,3} ;
		int arrayLength = array.length ;
		int max_sum = 0 , max_sum_till_now = 0 ;
	    max_sum_till_now = array[0] ;

	    for(int i = 1 ; i < arrayLength ; i++){
	    	
	    	max_sum_till_now = Math.max(0, max_sum_till_now+ array[i]) ;
	    	max_sum = Math.max(max_sum, max_sum_till_now) ;
	    }

	    System.out.println(max_sum) ;
	}
}