class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')){
                sb.append(c);
            }
        }
        System.gc();
        return ispalindrome(sb.toString());
    }
    public boolean ispalindrome(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        }
        return true;
    }
}