class Solution {
    public int largestAltitude(int[] gain) {
        int al= 0,sum=0;
        int n = gain.length;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            al = Math.max(sum,al);
        }
        return al;
    }
}