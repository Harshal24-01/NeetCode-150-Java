class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length -1;
        int ans = 0;
        while(i < j){
            int distance = j-i;
            int min = Math.min(heights[i],heights[j]);

            if(min * distance > ans){
                ans = min * distance;
            }
            if(heights[i]<=heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
