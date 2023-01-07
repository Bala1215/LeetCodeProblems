class PowerOfTwo{

 //method 1 : Time Complexity : O(log n)

 public static boolean isPowerOfTwo(int n){
  
   while(n>0){
       /* if we reduce 'n' by 2 each time it will result as '1' at last,     	  then it's a power of 2*/

       if(n==1)
           return true;
           
    
       /*Eg : 12 :  12 /2 => 6 => 6/2 => 3 => 3/2!==0 
         here, '12' is a multiple of 2 but not a power of 2*/
         
       if(n%2!=0)
          return false;
          
      /* every time , divide the n by '2'
         eg : 8 : 2^3 => 2 * 2 * 2
       */
      
      
       n/=2;
    }
    return false;

   // if n >=0 return false

 }
 
 
 /*method 2 : Time Complexity : O(1)

 public static boolean isPowerOfTwo(int n){
     //if it's a negative value or equal to '0'

     if(!(n>0))   
        return false; 
    
    /* 1073741824(2 ^ 30 ) is value which is a power of '2'   	 	near to max value of int in java.

      why 1,073,741,824 is used here ?
      parameter is a type of 'int', so it should not excceed max  	range of 'int' in java.     
      
    if(1073741824 % n == 0)
         return true;
    
    return false;

    //if 'n' is not -ve as well as not a power of '2'
 }

*/
 
  public static void main(String[] args){
       System.out.println(isPowerOfTwo(0)); //o/p : false
       System.out.println(isPowerOfTwo(-1073741824)); 
	 //o/p : false
       System.out.println(isPowerOfTwo(1073741824)); 
	 //o/p : true
       System.out.println(isPowerOfTwo(32));
       // o/p : true
       System.out.println(isPowerOfTwo(12));
       // o/p : false
	  
      //method 3 : oneline method to find is the power of 2 .
      int n = 32;
      System.out.println("Method 3 : "+ (n>0 && Integer.MIN_VALUE % n==0 ? true : false))
   }
}
