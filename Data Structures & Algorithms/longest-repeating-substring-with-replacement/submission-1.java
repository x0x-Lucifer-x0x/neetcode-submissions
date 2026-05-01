class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int maxCount = 0, res = 0;
        int l = 0;

        for(int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(r) - 'A']);

            while((r-l+1)-maxCount > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
// x,y,y,x, k = 2
// count = 0, l = 0 r =0
// x==x -> count+1
// (0-0+1)-1 > 2
// res (0,1)=1

// count = 1, l=0, r=1
// y==x 
// res=(1,2)=2

// count = 1, l=0, r=2
// y==x
// res=(2,3)=3

// count = 1, l=0, r=3
// x==x -> count=2
// 