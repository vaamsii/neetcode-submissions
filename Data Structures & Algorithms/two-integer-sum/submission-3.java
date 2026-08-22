class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        int complement = 0;

        for(int i =0 ; i<nums.length; i++){
            complement = target - nums[i];

            if(map.get(nums[i]) != null){
                return new int[]{map.get(nums[i]), i};
            }
            
            map.put(complement, i);
            System.out.println(map.get(nums[i]));
        }


        return new int[]{};
    }
}
