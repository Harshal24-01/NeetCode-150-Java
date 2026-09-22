class Solution {
    public int pivotIndex(int[] nums) {
      
        int start = 0;
        int end = nums.length - 1;

        for (int mid = start; mid <= end; mid++) {

            int leftsum = 0;
            int rightsum = 0;

            for (int i = 0; i < mid; i++) {
                leftsum = leftsum + nums[i];
            }

            for (int i = mid + 1; i <= end; i++) {
                rightsum = rightsum + nums[i];
            }

            if (leftsum == rightsum) {
                return mid;
            }
        }

        return -1;
    }
}