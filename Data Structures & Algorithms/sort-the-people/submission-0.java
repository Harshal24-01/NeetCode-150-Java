public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] res = new String[heights.length];
        for (int i = 0; i < heights.length; i++) {
            res[i] = map.get(heights[heights.length - 1 - i]);
        }

        return res;
    }
}