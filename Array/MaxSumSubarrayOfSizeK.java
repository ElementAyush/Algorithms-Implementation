class MaxSumSubarrayOfSizeK{

	public static void main(String[] args){

		int arr[] = new int[]{2,7,3,6,1,8} ;
		int arrLength = arr.length ;
 		int i = 0 , j = 0 , max_sum = Integer.MIN_VALUE , sum = 0 , k = 3 ;

 		while(j < arrLength){
 			sum = sum + arr[j] ;

 			if((j - i + 1) < k)
 				j++ ;
 			else if((j - i + 1) == k){
 				max_sum = Math.max(sum , max_sum) ;
 				sum -= arr[i] ;
 				i++ ; j++ ;
 			}
 		}

 		System.out.println(max_sum) ;


	}
}