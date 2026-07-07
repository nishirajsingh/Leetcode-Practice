class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] c = new char[n];
        for(int i=0;i<n;i++){
            c[indices[i]] = s.charAt(i); 
        }
        return String.valueOf(c);
    }
}