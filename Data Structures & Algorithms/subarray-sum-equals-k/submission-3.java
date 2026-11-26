class Solution {
    public int subarraySum(int[] nums, int k) {
        // if the nums[i] (current index) equals k
        // we can add increment the sum counter

        // int sum = 0;

        // for(int i =0; i< nums.length; i++){
        //     int runningSum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         runningSum += nums[j];
        //         if (runningSum == k){
        //             sum++;
        //         }
        //     }
        //     }

        int sum = 0;
        int currentSum = 0;

        Map<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0,1);

        for(int num: nums){
            currentSum+= num;
            int difference = currentSum - k;
            if(prefixSums.containsKey(difference)){
                sum += prefixSums.get(difference);
            }
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }
            

        return sum;
    }
}