class Stock{


	public static void main(String[] args){

		int[] prices = new int[]{7,6,4,3,1} ;
		int priceLen = prices.length ;
		int max_sum = Integer.MIN_VALUE, profit = 0 , min_value = Integer.MAX_VALUE ;

		for(int price : prices){
         
          min_value = Math.min(price , min_value) ;
          profit = price - min_value ;
          max_sum = Math.max(max_sum,profit) ;
		} 
		System.out.println(max_sum) ;
	}
}