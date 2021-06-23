class FindTheSecondLargest{
  public static void main(String[] args){

    int array[] = new int[]{1,8,3,4,12} ;
    int arrayLength = array.length ;
    int maxSoFar = 0 , secondLargest = 0;

    for(int i = 0 ; i < arrayLength ; i++){
      if(maxSoFar < array[i]){
        secondLargest = maxSoFar ;
        maxSoFar = array[i] ;
      }else if(array[i] > secondLargest){
        secondLargest = array[i] ;
      }
    }
    System.out.println(secondLargest);
  }

}
