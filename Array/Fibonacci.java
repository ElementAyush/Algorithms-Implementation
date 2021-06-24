import java.util.Scanner;
class Fibonacci{

  // 0 1 1 2 3 5 8
  public static void main(String[] args){

    int a = 0 , b = 1 , c = 0 ;
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt() ;

    for(int i = 0 ; i < 10 ; i++){
      System.out.print(a + " ") ;
       c = a + b ;
       a = b ;
       b = c ;
    }
  }
}
