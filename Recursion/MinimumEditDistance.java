class MinimumEditDistance{

  public int computeDistance(String a , String b , int pos1 , int pos2){

    if(a.charAt(pos1) == b.charAt(pos2)){
      computeDistance(a, b, pos1 - 1, pos2 - 1) ;
    }

    return 1 + Math.min(
    computeDistance(a, b, pos1 + 1, pos2),
    computeDistance(a, b, pos1 - 1, pos2),
    );
  }

  public static void main(String[] args){
    String a = "abc" ;
    String b = "abd" ;

    System.out.println(computeDistance(a,b,2,2)) ;
  }
}
