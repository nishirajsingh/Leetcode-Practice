class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int o=0,e=0,om=1001,em=1001;
        for(int i=0;i<26;i++){
            if(freq[i]==0) continue;
            if(freq[i]%2!=0){
                o=Math.max(o,freq[i]);
                om = Math.min(om,freq[i]);
            }
            else{
                e=Math.max(e,freq[i]);
                em = Math.min(em,freq[i]);
            }
        }
        return Math.max(o-em,om-e);
    }
}