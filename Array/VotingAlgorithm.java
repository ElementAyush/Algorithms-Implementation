/*
Implimentation of Mody's voting algorithm
*/
class VotingAlgorithm{

  public static void main(String[] args){
  int nums[] = new int[]{1,2,2,2,3,4} ;
  int count = 0, newNum = nums[0] ;
      int numsLength = nums.length ;

        for(int i = 0 ; i < numsLength ; i++){
            if(count == 0){
                newNum = nums[i] ;
                count = 0 ;
            }
            count+= (newNum == nums[i]) ? 1 : -1;
        }
     System.out.println(newNum) ;
 }
}
