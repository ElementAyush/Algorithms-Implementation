class MaxOneLength{

  public static void main(String[] args){

    boolean isOneGot = false ; int maxLength = 0 , count = 0 ;
    int n = 1041 ;

    while(n != 0){

      if(n % 2 == 1 && isOneGot == false){
        isOneGot = true ;
      }
      else if(n % 2 == 1 && isOneGot == true){
        maxLength = Math.max(maxLength , count) ;
        count = 0 ;
      }
      if(isOneGot == true)
       count++ ;

       n /= 2 ;
    }

    System.out.println(Math.max(maxLength - 1,0)) ;
  }
}
