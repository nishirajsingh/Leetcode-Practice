class Solution {
    public boolean halvesAreAlike(String s) {
        return count(s.substring(0,s.length()/2))==count(s.substring(s.length()/2,s.length()));
    }
    public int count(String s){
        int v=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' || s.charAt(i)=='u')v++;
        }
        return v;
    }
}