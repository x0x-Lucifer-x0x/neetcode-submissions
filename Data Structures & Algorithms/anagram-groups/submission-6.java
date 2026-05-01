class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create an array of 26 size.
        //add count for each character in strs
        //take curr s and put matching charcount array together {charCount, (s[1],s[3])}
        // {
        //    "key1 for eat/tea/ate": ["eat", "tea", "ate"],
        //    "key2 for tan/nat": ["tan", "nat"],
        //    "key3 for bat": ["bat"]
        // }
        //return the new arrayList


        HashMap<String, List<String>> m = new HashMap<>();

        for(String s : strs) {
            int[] n = new int[26];
            for(char c : s.toCharArray()){
                n[c - 97]++;
            }

            String key = Arrays.toString(n);
            m.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(m.values());

    }
}
