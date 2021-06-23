class ShiftALLElementByOne{

   public static void main(String[] args){
     int array[] = new int[]{1,2,3,4,5} ;
     int arrayLength = array.length ;

     int key = array[1] ;
     //Shift to the right
     for(int i = 1 ; i < arrayLength ; i++){
       array[i] = array[i - 1] ;
       
     }
   }
}
