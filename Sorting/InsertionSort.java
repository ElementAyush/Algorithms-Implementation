class InsertionSort{

	public static void main(String[] args){

		int[] array = new int[]{5,1,4,6,3,9} ;
		int arrayLength = array.length ;
		for(int i = 1 ; i < arrayLength ; i++){
			if(array[i] < array[i - 1]){
				int key = array[i] ;
				int j = i - 1 ;
				while(array[j] > key && j >=0){
					//swap
					j-- ;
				}
				int temp = array[i] ;
				array[i] = key ;
				array[i] = temp ;
			}
		}
	}
}
