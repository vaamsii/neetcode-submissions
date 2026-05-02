class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char sc : s.toCharArray()){
            sMap.put(sc, sMap.getOrDefault(sc, 0) + 1);
        }

        for (char tc : t.toCharArray()){
            tMap.put(tc, tMap.getOrDefault(tc, 0) + 1);
        }

        if (sMap.equals(tMap)){
            return true;
        }


        return false;
    }
}
