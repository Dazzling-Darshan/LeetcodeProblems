class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return cal(nums, nums.length-1, dp);

    }

    public int cal(int[] nums, int index, int[] dp){

        if(index == 0) return nums[0];

        if(index < 0) return 0;

        if(dp[index] != -1) return dp[index];

        int left = nums[index] + cal(nums, index-2,dp);
        int right = 0 + cal(nums, index-1,dp);

        dp[index] = Math.max(left,right);
        return dp[index];
    }
}