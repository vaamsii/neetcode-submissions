class Solution {
    public int lengthOfLastWord(String s) {
        String sLower = s.toLowerCase();

        sLower = sLower.trim();

        return sLower.length() - sLower.lastIndexOf(" ") - 1;
    }
}