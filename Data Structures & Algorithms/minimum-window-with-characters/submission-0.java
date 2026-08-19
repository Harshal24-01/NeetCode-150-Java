class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

       
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int required = need.size();

        int left = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c)
                    && window.get(c).equals(need.get(c))) {
                have++;
            }
            while (have == required) {

              
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                // We no longer satisfy this character's requirement
                if (need.containsKey(leftChar)
                        && window.get(leftChar) < need.get(leftChar)) {
                    have--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}