class MaximumPriceRodCutting{

   static int maximumPriceRodCutPrice(int[] pricePerLength, int arraylength){
     if(arraylength <= 0)
      return 0 ;
     int q = Integer.MIN_VALUE ;
     for(int i = 0 ; i < arraylength ; i++){
       q = Math.max(q, pricePerLength[i] + maximumPriceRodCutPrice(pricePerLength, arraylength - i - 1)) ;
     }

     return q ;
   }

  public static void main(String[] args){

    int[] pricePerLength = new int[]{1,5,8,9,10,17,17,20,24,30} ;
    int arraylength = pricePerLength.length ;
    int length = 4 ;
    System.out.println(maximumPriceRodCutPrice(pricePerLength, length)) ;


  }
}
