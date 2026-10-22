
class Solution {
    public boolean isCircularSentence(String sentence) {

        int n = sentence.length();

        // Check the last character against the first character
        if (sentence.charAt(0) != sentence.charAt(n - 1)) {
            return false;
        }

        // Check every boundary between two words
        for (int i = 0; i < n; i++) {

            if (sentence.charAt(i) == ' ') {

                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
