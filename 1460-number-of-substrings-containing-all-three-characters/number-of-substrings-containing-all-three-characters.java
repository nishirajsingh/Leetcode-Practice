class Solution {
    public int numberOfSubstrings(String s) {
        int[] temp = new int[]{-1,-1,-1};
        int res=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            temp[c-'a']=i;
            res+= Math.min(temp[0],Math.min(temp[1],temp[2]))+1;
        }
        return res;
        
    }
}