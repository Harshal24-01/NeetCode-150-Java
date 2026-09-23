class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        int maxElement = 0;
        for(int num : map.keySet()){
            if(map.get(num) > maxFreq){
                maxFreq = map.get(num);
                maxElement = num;
            }
        }
        return maxElement;
    }
}
