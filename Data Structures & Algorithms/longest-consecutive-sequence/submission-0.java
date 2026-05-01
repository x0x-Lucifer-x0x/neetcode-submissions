class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;
        for(int num : numSet){
            // 0 , 3, 5, 2 ,4, 1,7, 8
            if(!numSet.contains(num-1)){
                int length = 1;
                while(numSet.contains(num + length)){
                    length++;
                } 
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
