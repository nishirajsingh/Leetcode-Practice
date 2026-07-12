class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int stringItreator=0;stringItreator<s.length();stringItreator++) {
            arr[s.charAt(stringItreator)]++;
        }
        int res = 0;
        for(int arrelement : arr) {
            res += arrelement / 2 * 2;
        }
        res+=res<s.length()?1:0;
        return res;
    }
}