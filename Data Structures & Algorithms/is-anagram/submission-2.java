class Solution {
    public boolean isAnagram(String s, String t) {

        // since it's the same characters with the same occurences
        // order doesn't matter, we can try storing it in a hashmap, to check the frequency of characters. 

        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        // basecase would be that if the length of both strings don't equal each other

        if(s.length() != t.length()){
            return false;
        }

        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char charS: sArray){
            s_map.put(charS, s_map.getOrDefault(charS, 0) + 1);
        }

        for(char charT: tArray){
            t_map.put(charT, t_map.getOrDefault(charT, 0) + 1);
        }

        return s_map.equals(t_map);
    }
}
