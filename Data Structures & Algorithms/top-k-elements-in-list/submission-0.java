class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        int count = 0;
        for(int n : nums){
            indexMap.put(n, indexMap.getOrDefault(n,0) + 1 );
        }
        
        List<Map.Entry<Integer, Integer>> entryList = 
        new ArrayList<>(indexMap.entrySet());

        Collections.sort(entryList, (a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
