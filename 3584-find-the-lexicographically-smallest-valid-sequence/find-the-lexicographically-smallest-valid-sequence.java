class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] last = new int[m+1];
        Arrays.fill(last, -1);
        last[m] = n;
        int a = m-1;
        for(int i=n-1;i>=0;i--) {
            if (a>=0 && word1.charAt(i)==word2.charAt(a)) {
                last[a]=i;
                a--;
            }
        }
        int[] res = new int[m];
        int idx = 0;
        a = 0;
        boolean alagHai = false;
        for (int i = 0; i < n && a < m; i++) {
            if (word1.charAt(i) == word2.charAt(a)) {
                res[idx++] = i;
                a++;
            } 
            else if(!alagHai && last[a + 1] > i) {
                res[idx++] = i;
                a++;
                alagHai = true;
            }
        }
        if(a==m) return res;
        return new int[0];
    }
}