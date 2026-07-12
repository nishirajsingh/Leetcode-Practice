class Solution {
    public int getNum(String s){
        int n = s.length();
        int i = n-1;
        int res=0,idx=1;
        while(i>=0){
            int d = s.charAt(i)-'a';
            res+=(d*idx);
            idx*=10;
            i--;
        }
        return res;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNum(firstWord)+getNum(secondWord)==getNum(targetWord);
    }
}