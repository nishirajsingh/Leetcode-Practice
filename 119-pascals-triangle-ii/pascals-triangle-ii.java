class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> res0= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res0.add(temp);
        for(int i=0;i<=rowIndex;i++){
            List<Integer> cur = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0||i==j)cur.add(1);
                else{
                    cur.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(cur);
        }
        if(rowIndex==0)return res0.get(rowIndex);
        return res.get(rowIndex);
    }
}