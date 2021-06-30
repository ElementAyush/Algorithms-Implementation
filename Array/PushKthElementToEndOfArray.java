/*
* In this example 2 is being pushed to the end of the array
*/
class PushKthElementToEndOfArray{

  static int getTheSwapIndex(int[] num, int k, int index){
    while(num[index] == k && index != 0){
      index-- ;
    }
    return index ;
  }

  public static void main(String[] args){
    int[] num = new int[]{2,2,4,5,2,2,3,6,2,2} ;
    int k = 2 ;
    int index = num.length - 1 ;
    int left = 0 ;
    index = getTheSwapIndex(num, k, index) ;


    while(left < index){
      if(num[left] == k){
        //swap from the index
        
        num[left] = num[index] ;
        num[index] = k ;
        index = getTheSwapIndex(num, k, index) ;
      }
      left++ ;
    }
    for(int i : num){
      System.out.print(i+ " ") ;
    }
  }
}
