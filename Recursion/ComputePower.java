class ComputePower{
	
    public static long power(int num, int pow){
     if(pow == 0)
     	return 1 ;

     long result = power(num , pow / 2) ;

     if(pow % 2 == 0)
     	return result * result ;
     else
     	return result * result * num ;

    }

	public static void main(String[] args){
      
      System.out.println(power(2,2)) ;
	}
}