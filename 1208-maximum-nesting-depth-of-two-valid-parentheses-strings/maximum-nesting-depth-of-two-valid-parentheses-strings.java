class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res= new int[n];
        for(int i=0,a=0;i<n;i++){
            if(seq.charAt(i)=='('){
                res[i]= a%2;
                a++;
            }
            else {
                a--;
                res[i]=a%2; 
            }
        }
        return res;

    }
}