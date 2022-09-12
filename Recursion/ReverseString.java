class ReverseString{

  static char reverseTheString(String str, StringBuilder revstr, int index){

    
    if(index == str.length() - 1){
      return str.charAt(index) ;
    }
    char c = reverseTheString(str, revstr, index + 1) ;
    revstr.append(c) ;
    return str.charAt(index) ;
  }

  public static void main(String[] args){
    String str = "Ayush" ;
    StringBuilder revstr = new StringBuilder() ;
    reverseTheString(str,revstr, 0) ;
    System.out.println(revstr.append(str.charAt(0))) ;
  }
}
