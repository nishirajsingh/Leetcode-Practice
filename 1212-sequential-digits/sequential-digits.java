class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new  ArrayList<>();
        String s = "123456789";
        int minlen = String.valueOf(low).length();
        int maxlen = String.valueOf(high).length();
        for(int len=minlen;len<=maxlen;len++){
            for(int i=0;i<=9-len;i++){
                String temp = s.substring(i,i+len);
                int n=0;
                if(!temp.isEmpty()){
                    n= Integer.valueOf(temp);
                }
                if(n>=low && n<=high) res.add(n);
            }
        }
        return res;
    }
}