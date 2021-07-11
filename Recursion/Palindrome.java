class Palindrome{

  static boolean isPalindrome(String str, int left, int right){
      if(left >= right){
        return true ;
      }
      if(str.charAt(left) != str.charAt(right)){
        return false ;
      }

    return true & isPalindrome(str, left+1, right-1) ;
  }

  public static void main(String[] args){
    String str = "12231" ;
    int left = 0 ;
    int right = str.length() - 1 ;
    System.out.println(isPalindrome(str, left, right)) ;
  }
}
