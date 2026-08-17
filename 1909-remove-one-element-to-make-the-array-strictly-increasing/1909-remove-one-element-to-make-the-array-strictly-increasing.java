class Solution {
    public boolean canBeIncreasing(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            boolean increasing = true;

            int prev = -1;

            for (int j = 0; j < nums.length; j++) {

                if (j == i) {
                    continue;
                }

                if (prev != -1 && nums[j] <= nums[prev]) {
                    increasing = false;
                    break;
                }

                prev = j;
            }

            if (increasing) {
                return true;
            }
        }

        return false;
    }
}