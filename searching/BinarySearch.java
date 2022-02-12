class BinarySearch{

	public static boolean isElementFound(int[] arr, int arrSize, int searchedElement){

		int left = 0 , right = arrSize - 1; 

		while(left <= right){

			int mid = (left + right)/ 2;
	
			if(arr[mid] == searchedElement)
				return true;
			else if(arr[mid] > searchedElement)
				right = mid - 1 ;
			else if(arr[mid] < searchedElement)
				left = mid + 1 ;
		}
		return false ;

	} 
	
	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5,6,7,8} ;
		int arrSize = arr.length ;
		int searchedElement = 0 ;
        System.out.println(isElementFound(arr, arrSize, searchedElement)) ;
	}
}