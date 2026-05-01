class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for(int i = stones.length - 1; i >= 1; i--){
            int diff = stones[i] - stones[i - 1];
            stones[i - 1] = diff;
            Arrays.sort(stones, 0, i);
        }
        return stones[0];
    }
}
