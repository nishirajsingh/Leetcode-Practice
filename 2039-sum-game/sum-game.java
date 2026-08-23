class Solution {
    public boolean sumGame(String num) {
        int s=0;
        int c =0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?')c--;
            else s+= num.charAt(i)-'0';
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?')c++;
            else s-=num.charAt(i)-'0';
        }
        if(s*2 == c*9)return false;
        return true;
    }
}