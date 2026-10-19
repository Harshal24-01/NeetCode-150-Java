class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       Hashtable<Character, Integer> map = new Hashtable<>();
        int maxLen = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int length = i - map.get(ch) - 1;
                maxLen = Math.max(maxLen, length);
            } else {
                map.put(ch, i);
            }
        }

        return maxLen;
    }
}