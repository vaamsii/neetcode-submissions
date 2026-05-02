class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        // for (char sc : s.toCharArray()){
        //     sMap.put(sc, sMap.getOrDefault(sc, 0) + 1);
        // }

        // for (char tc : t.toCharArray()){
        //     tMap.put(tc, tMap.getOrDefault(tc, 0) + 1);
        // }

        // note the above is o(n) time complex. but space complex. wise
        // I am doing more since I am creating an extra array everytime
        // more optimal space complexity:

        for (int i =0; i < s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (sMap.equals(tMap)){
            return true;
        }


        return false;
    }
}
