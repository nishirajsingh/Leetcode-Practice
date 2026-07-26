class Solution {
    public boolean hasSameDigits(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        while(n>2){
            for(int i=0;i<n-1;i++){
                int sum = (c[i]-'0')+(c[i+1]-'0');
                c[i] = (char)((sum%10)+'0');
            }
            n--;
        }
        return c[0]==c[1];
    }
}