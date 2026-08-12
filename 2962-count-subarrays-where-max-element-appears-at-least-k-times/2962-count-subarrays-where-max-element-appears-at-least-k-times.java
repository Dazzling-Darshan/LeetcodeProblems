class Solution {
    public long countSubarrays(int[] nums, int k) {

        int max = 0;

        for (int x : nums) {
            max = Math.max(max, x);
        }

        int left = 0;
        int maxCount = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == max) {
                maxCount++;
            }

            while (maxCount >= k) {

                if (nums[left] == max) {
                    maxCount--;
                }

                left++;
            }

            ans += left;
        }

        return ans;
    }
}