class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int n = 0; n < numbers.length; n++){
            int diff = target - numbers[n];
            if(indices.containsKey(diff)) {
                return new int[] {indices.get(diff), n+1};
            }

            indices.put(numbers[n], n + 1);
        }

        return new int[0];
    }
}
