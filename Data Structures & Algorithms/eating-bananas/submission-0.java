class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = 0;

        // Maximum pile = maximum possible speed
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {

            int k = left + (right - left) / 2;

            int hours = 0;

            for (int pile : piles) {
                hours += (pile + k - 1) / k;
            }

            if (hours <= h) {
                // k works, try a smaller speed
                right = k - 1;
            } else {
                // k is too slow
                left = k + 1;
            }
        }

        return left;
    }
}
