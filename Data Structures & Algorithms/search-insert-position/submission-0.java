class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = nums.length;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }
}