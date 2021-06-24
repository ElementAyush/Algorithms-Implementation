class ShiftAllElementByOne{

   public static void main(String[] args){
     int array[] = new int[]{1,2,3,4,5} ;
     int arrayLength = array.length ;

     int key = array[0] ;
     //Shift to the right
     for(int i = 1 ; i < arrayLength ; i++){
       int key2 = array[i] ;
        array[i] = key ;
        key = key2 ;
     }
     array[0] = key;
     for(int i : array){
       System.out.print(i + " ") ;
     }
   }
}
