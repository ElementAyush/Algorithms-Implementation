class MoveNegativeNumberToEnd{
	

    public static void swap(int[] arr, int i , int j){
    	int temp = arr[i] ;
    	arr[i] = arr[j] ;
    	arr[j] = temp ;
    }

	public static void main(String[] args){
		int[] arr = new int[]{-1,2,3,4,5,-8,-6,2,-10,-9,4,5,6,-1} ;
		int arrayLength = arr.length ;

		int i = 0 , j = arrayLength - 1 ;

		while(i < j){

			while(arr[i] < 0 && i < j)
				i++ ;
			while(arr[j] > 0 && j > i)
				j-- ;
			swap(arr,i , j) ;
		}

		for(int k : arr){
			System.out.print(k + " ") ;
		}
	}
}