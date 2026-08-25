class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int max = 0;
        for(int x : nums){
            max = Math.max(max, x);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int d : nums){
            set.add(d);
        }

        for(int i=1; i<=1000;i++){
            if(!set.contains(i) && i%k == 0){
                return i;
            }else if(i > max && i%k==0){
                return i;
            }
        }

        return 0;
    }
}