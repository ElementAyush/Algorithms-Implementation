class Lcs{


public static int checkLcs(String s1 , String s2, int lens1 , int lens2){

  if(lens1 == 0 || lens2 == 0)
    return 0 ;

  else if(s1.charAt(lens1 - 1) == s2.charAt(lens2 - 1))
    return 1 + checkLcs(s1, s2, lens1 - 1, lens2 - 1) ;

    return Math.max(checkLcs(s1, s2, lens1 - 1, lens2) , checkLcs(s1, s2, lens1, lens2 - 1)) ;
}
  public static void main(String[] args){

    System.out.println(checkLcs("abcdef", "acf", 6, 3)) ;
  }
}
