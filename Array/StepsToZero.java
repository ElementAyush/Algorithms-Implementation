import java.util.* ;

class StepsToZero{

	public static void main(String[] args){
		List<Integer> arr = new ArrayList<>() ;
		arr.add(2) ;
		arr.add(3) ;
		arr.add(4) ;
		arr.add(8) ;
		arr.add(9) ;
        int count = 0 ;

		while(arr.size() > 2){
          int sum =  arr.get(0) + arr.get(1) ;
          arr.add(sum) ;
          arr.remove(0) ;
          arr.remove(0) ; 
          count += sum ;
		}

		System.out.println(count + arr.get(0) + arr.get(1)) ;
	}
	
}