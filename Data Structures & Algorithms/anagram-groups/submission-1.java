class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> v = new HashMap<>();

        for(String s : strs){
            char[] n = new char[26];
            for(char c : s.toCharArray()){
                n[c - 97]++;
            }

            String key = String.valueOf(n);
            v.computeIfAbsent(key , k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(v.values());
    }
}
