class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // input is numbers, sorted in ascending order

        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            int currentSum = numbers[left] + numbers[right];

            // if currentSum > target, meaning we need to decrement right
            if(currentSum > target){
                right--;
            }
            else if (currentSum < target){
                left++;
            }
            else{
                // since it's 1-indexed, we have to add by 1
                return new int[] {left + 1, right + 1};
            }
        }

        return new int[0];
    }
}
