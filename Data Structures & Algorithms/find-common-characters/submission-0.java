class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] common = new int[26];

        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {

            int[] current = new int[26];

            for (char c : words[i].toCharArray()) {
                current[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], current[j]);
            }
        }

        for (int i = 0; i < 26; i++) {

            while (common[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return result;
    }
}