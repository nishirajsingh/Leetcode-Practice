class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int res = 0;
        int temp=0;
        for(int i=0;i<n;i++){
            int c1= 0;
            for(int j=0;j<m;j++){
                if(bank[i].charAt(j)=='1')c1++;
            }
            if(c1>0){
                if(temp!=0){
                    res+=(c1*temp);
                    temp=c1;
                }else {
                    temp=c1;
                }
            }
        }
        return res;
    }
}