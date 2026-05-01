class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> res = new HashMap<>();

       for (String s : strs) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String c = new String(charArray);
        res.putIfAbsent(c, new ArrayList<>());
        res.get(c).add(s);
       } 
       return new ArrayList<>(res.values());
    }
}
