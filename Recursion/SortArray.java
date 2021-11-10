class SortArray{

  public static void main(String[] args){
    int[] unsortedArray = new int[]{5,4,3,2,1} ;
    int arraySize = unsortedArray.length ;
    sortTheArray(unsortedArray, arraySize) ;
  }

  public static void sortTheArray(int[] unsortedArray , int arraySize){

    if(arraySize < 0)
     return ;

    sortTheArray(unsortedArray, arraySize - 1) ;
  }
}
