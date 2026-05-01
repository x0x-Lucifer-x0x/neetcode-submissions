class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> v = new HashMap<>();

        for(String s : strs){
            int[] n = new int[26];
            for(char c : s.toCharArray()){
                n[c - 97]++;
            }

            v.putIfAbsent(Arrays.toString(n), new ArrayList<>());
            v.get(Arrays.toString(n)).add(s);
        }
        return new ArrayList<>(v.values());
    }
}
