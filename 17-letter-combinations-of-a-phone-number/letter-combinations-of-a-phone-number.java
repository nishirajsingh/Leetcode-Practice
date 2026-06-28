class Solution {
    public void recursion(String d, int idx,String c ,String[] arr,List<String> res){
        if(idx==d.length()) {
            res.add(c);
            return;
        }
        String f = arr[d.charAt(idx) - '2'];
        for (int i=0;i<f.length();i++) {
            recursion(d, idx+1,c + f.charAt(i),arr, res);
        }

    }
    public List<String> letterCombinations(String digits) {
        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        recursion(digits,0,"",arr,res);
        return res;

    }
}