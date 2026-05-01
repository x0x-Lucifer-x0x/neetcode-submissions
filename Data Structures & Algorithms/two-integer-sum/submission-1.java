class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hashmap
        //get difference between the target & nums[i]
        //check if diff present in hashmap
        //if there then return i, diff(key)
        //add nums[i] to hashmap with format {key->nums[i]:value[i]}

        Map<Integer, Integer> num = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(num.containsKey(diff)) {
                return new int[] {num.get(diff), i};
            }

            num.put(nums[i], i);
        }

        return new int[]{};

    }
}
