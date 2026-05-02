class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        // List<List<String>> result = new ArrayList<>();


        for (int i =0; i<strs.length; i++){
            // System.out.println(strs[i]);
            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);

            // System.out.println(sorted);

            ArrayList<String> list = new ArrayList<>();
            // System.out.println(list + "before");

            if (!map.containsKey(sorted)){
                list.add(strs[i]);
                // System.out.println(list + "after");
                map.put(sorted, list);
                // System.out.println(map + "after map");
            }
            else{
                // System.out.println(map.get(sorted));
                map.get(sorted).add(strs[i]);
                // System.out.println(map + "after map");
            }
        }
        // System.out.println(map);

        return new ArrayList<>(map.values());
    }
}
