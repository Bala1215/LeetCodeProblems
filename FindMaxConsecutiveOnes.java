class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0,max=0;
        
        for(int index=0;index<nums.length;index++){
            if(nums[index]==1){
                count++;
                max = count > max ?count:max;
            }
            else
                count=0;
            //whenever current index value is '0' then, count start from 0 .
            //by doing this, we can find max consecutive count of '1' in an array
            
        }
        return max;
        
    }
        
    }