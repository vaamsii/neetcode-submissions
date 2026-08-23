class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // let's put the anagrams in a group based of the 
        // string's sorted order -> for example
        // stop, pots and tops all equal to opst when sorted
        // act and cat become act when sorted
        // the grouping can be in a map, because the unique value here
        // is the opts or act, both of these sorted strings
        // represent an anagram and any other variation of these would
        // have the same characters and length would be the same.
        // map: [key: "opst" , value: ("stop", "pots", "tops")]
        // return would be the values in the map

        Map<String, List<String>> map = new HashMap<>();

        for(int i =0; i < strs.length; i++){
            // basically the ordering can be done with character Array

            // let's walkthrough with example
            // index is "tops" -> strs[i] = "tops"
            // chars -> ['t','o','p', 's']
            char[] chars = strs[i].toCharArray();

            // becomes ['o', 'p', 's', 't']
            Arrays.sort(chars);

            // let's convert it back to a String
            // sortedStr = "opst"
            String sortedStr = new String(chars);
            // System.out.println(strs[i]);
            // System.out.println(sortedStr);

            // so now we have the key in our Map -> sortedString
            // the value in the map is the list of strs

            if(!map.containsKey(sortedStr)){
                // we don't always need to create the arraylist
                // for every iteration, only when a new 
                // list is being added to the key that's not present
                ArrayList<String> list = new ArrayList<>();

                // add the current strs[i] to the List
                list.add(strs[i]);

                map.put(sortedStr, list);
            }
            else{
                map.get(sortedStr).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
