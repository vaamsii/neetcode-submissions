class Solution {
    public int[] findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i =0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
            if (map.get(nums[i]) == 2){
                list.add(nums[i]);
            }
        }
        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
