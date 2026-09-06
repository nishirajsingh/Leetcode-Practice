class Solution {
    public int numDistinct(String s, String t) {
        var m = s.length();
        var n = t.length();
        var a = new int[n+1];
        a[0]=1;
        for(int i=1;i<=m;i++){
            for(int j=n;j>=1;j--){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    a[j]=a[j]+a[j-1];
                }
            }
        }
        return a[n];
    }
}