class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {

        int len = nums.length;
        if(len == 1 && n == 1 && nums[0] == 0) return true;
        int count = 0;

        for(int i=0;i<len ;i++){
           
                if(i == 0 && i < len - 1 && nums[i]==0 && nums[i + 1] != 1){
                    nums[i] = 1;
                    count++;
                }else if(i==len - 1 && i > 1 && nums[i]==0 && nums[i-1] == 0){
                    nums[i] =1;
                    count++;
                }else if(i > 0 && i < len - 1 && nums[i-1] == 0 && nums[i] == 0 && nums[ i+1]==0){
                    nums[i] =1;
                    count++;
                }

            }
        
        return count >= n;
    }
}

// 1 1 0 0 0 0 1 0 0 0 0
// 0 0 0 0 0 1 0 0 1 0 1 0 0 0 0