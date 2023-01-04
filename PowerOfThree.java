class PowerOfThree{

 //method 1 : Time Complexity : O(log n)

 public static boolean isPowerOfThree(int n){
  
   while(n>0){
  
       if(n==1)
           return true;
           
       /* power of 3 : every value should multiple of '3' 
          eg : 27/3 = 9=> 9/3 =>3=> 3/3 =1 
                (27 : power of 27)
                15/3 => 5 => 5/3 !==0 
                i.e, '5' is not a multiple of 3
               and ends before it reduce as '1'. thus 15! power of '3' 
       */
       
       if(n%3!=0)
          return false;
          
      /* every time , divide the n by '3'
         eg : 27 : 3^3 => 3 * 3 * 3
      */
      
       n/=3;
    }
    return false;
   // if n >=0 return false
 }
 
 /*method 2 : Time Complexity : O(1)

 public static boolean isPowerOfThree(int n){
     //if it's a negative value

     if(!(n>0))   
        return false; 
    
    /* 11622661467(3 ^ 19 ) is value which is a power of '3' 	 	   near to max value of int in java
       
         why 1162261467 is used here ?
         parameter is a type of 'int', so it should not excceed max 	   range of 'int' in java     
      
    if(1162261467 % n == 0)
         return true;
    
    return false;

    //if 'n' is not -ve as well as not a power of '3'
 }

*/
 
  public static void main(String[] args){
       System.out.println(isPowerOfThree(0));
	 //o/p : false
       System.out.println(isPowerOfThree(-1162261467));
       //o/p : false
       System.out.println(isPowerOfThree(1162261467)); 
       //o/p : true
       System.out.println(isPowerOfThree(27));
       // o/p : true
       System.out.println(isPowerOfThree(15));
       // o/p : false
   }
}