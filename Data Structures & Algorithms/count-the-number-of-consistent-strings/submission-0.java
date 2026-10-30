class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] allowedChars = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            boolean consistent = true;

            for (int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j);

                if (!allowedChars[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}