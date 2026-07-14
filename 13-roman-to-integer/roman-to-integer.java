class Solution {
    public int romanToInt(String s) {
        int[] a = new int[128];
        a['I'] = 1;
        a['V'] = 5;
        a['X'] = 10;
        a['L'] = 50;
        a['C'] = 100;
        a['D'] = 500;
        a['M'] = 1000;
        int res = 0;
        for(int i=0;i<s.length();i++) {
            int v = a[s.charAt(i)];
            if(i<s.length()-1 && v<a[s.charAt(i+1)]) {
                res-=v;
            }else {
                res+=v;
            }
        }
        return res;
    }
}