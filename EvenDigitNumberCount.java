class EvenDigitNumberCount {
    //1.to find each index value's digit count
    //2. check whether the digit count is even or odd 
    //3.if it's even then increase the count 
    
    static int evenNumCount=0;
    
    public static int digitCount(int num){
        int count=0;
        while(num>0){
            num/=10; //every iteration remove last digit
            count++; 
            //after remove the last digit , increment the  count
        }
        return count;
    }
    
    public static int findNumbers(int[] nums) {
        for(int index=0; index<nums.length; index++){
             if(digitCount(nums[index])%2==0)
               evenNumCount++;  
        }
        return evenNumCount;
        
    }
    public static void main(String[] args){
      int[] arr= {1,2,3456,3};
      System.out.println(findNumbers(arr));
    }
}