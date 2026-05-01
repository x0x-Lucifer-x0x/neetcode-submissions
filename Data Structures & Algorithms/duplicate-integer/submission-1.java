class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++ ){
            for (int j = 0; j < l; j++) {
                if (i != j){
                    if (nums[i] == nums[j]) {
                        return true;
                }   
                }               
            }
        }

        return false;
    }
}