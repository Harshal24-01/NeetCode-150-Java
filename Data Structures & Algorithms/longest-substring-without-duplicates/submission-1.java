class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, len = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }
}