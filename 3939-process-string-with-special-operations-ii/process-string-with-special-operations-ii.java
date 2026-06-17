class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long strlength = 0;

        for(int i = 0; i < n; i++){
            char temp = s.charAt(i);
            if(Character.isLowerCase(temp)) strlength++;
            else if (temp == '*' && strlength > 0) strlength--;
            else if (temp == '#') strlength *= 2;
        }

        if(k < 0 || k >= strlength) return '.';

        for(int i = n - 1; i >= 0 ; i--){
            char c = s.charAt(i);
            
            if (Character.isLowerCase(c)) {
                if (k == strlength - 1) return c;
                strlength--; 
            } 
            else if (c == '*') strlength++;
            else if (c == '%') k = (strlength - 1) - k;
            else if (c == '#') {
                strlength /= 2;
                if (strlength > 0) k %= strlength;
            }
        }
        return '.';
    }
}