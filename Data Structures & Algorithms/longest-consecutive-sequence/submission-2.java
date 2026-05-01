class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int max = 1;
        int streak = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==nums[i-1]){
                continue;
            } else if (nums[i]==nums[i-1]+1){
                streak++;
            } else{
                if(streak>max){
                    max=streak;
                }
                streak=1;
            }
        }
        if(streak>max){
            max=streak;
        }
        return max;
    }
}
