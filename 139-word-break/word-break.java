class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] a = new boolean[s.length()+1];
        a[0]=true;
        for(int i=0;i<s.length();i++){
            if(!a[i])continue;
            for(String w:wordDict){
                if(s.startsWith(w,i)){
                    a[i+w.length()] =true;
                }
            }
        }
        return a[s.length()];
    }
}