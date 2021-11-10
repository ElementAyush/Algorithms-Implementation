class Print1ton{

  public static void main(String[] args){
    printtilln(8) ;
  }
  public static void printtilln(int n){

    if(n == 0)
     return ;


     printtilln(n - 1) ;
     System.out.println(n) ;
  }
}
