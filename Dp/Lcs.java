import java.util.* ;

class Lcs{

	public static int computeLCS(String str, String substr, int strLen, int substrLen, int[][] dp){
       
       if(strLen == 0 || substrLen == 0)
        return 0; 


       //return dp[0][0] ;
	}

	public static void main(String[] args){
		String str = "abcdef" ;
		String substr = "abcd" ;
		int strLen = str.length() , substrLen = substr.length() ;
		int dp[][] = new int[strLen + 1][substrLen + 1] ;
		Arrays.fill(dp, -1) ;
 
		System.out.println(computeLCS(str,substr,strLen,substrLen,dp)) ;

	}
}