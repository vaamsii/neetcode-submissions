class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(map);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for (int key: map.keySet()){
            maxHeap.add(key);
            //System.out.println(key);
            //System.out.println(maxHeap);
        }
        System.out.println(maxHeap);

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
