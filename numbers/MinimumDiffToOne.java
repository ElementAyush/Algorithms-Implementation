class MinimumDiffToOne{

  static int calculate(int num){
    int num2 = num ;
    int diff = 0 ;
    while(num2 != 0){
      diff = (num2% 10) - diff ;
      num2 /= 10 ;
    }
    return diff ;
  }

  public static void main(String[] args){
   int n= 1000 ;
   for(int i = 0 ; i < n ; i++){
     if(calculate(i) == 1){
       System.out.println(i) ;
     }
   }
  }
}
