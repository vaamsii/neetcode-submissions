class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        
        for(int num: nums){
            // this is the biggest thing
            // checking if it's a 0, will make our life easy
            if(num == 0){
                // update the max result
                result = Math.max(result, counter);
                //reset the counter now
                counter = 0;
            }
            else{
                counter++;
            }
        }
        // sometimes the result isn't update, if it's all 1s. 
        // so we need max between result and counter
        return Math.max(result, counter);
    }
}