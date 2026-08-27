class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (int i = n - 1; i >= 0; i--) {
            int[] temp = cnt.clone();
            boolean flag = true;

            for (int j = 0; j < i; j++) {
                int x = target.charAt(j) - 'a';

                if (temp[x] == 0) {
                    flag = false;
                    break;
                }

                temp[x]--;
            }

            if (!flag)
                continue;

            int tc = target.charAt(i) - 'a';

            for(int c = tc + 1; c < 26; c++) {
                if(temp[c] == 0)
                    continue;
                StringBuilder ans = new StringBuilder(target.substring(0, i));
                ans.append((char) ('a' + c));
                temp[c]--;
                for(int x = 0; x < 26; x++) {
                    for (int t = 0; t < temp[x]; t++) {
                        ans.append((char) ('a' + x));
                    }
                }
                return ans.toString();
            }
        }
        return "";
    }
}