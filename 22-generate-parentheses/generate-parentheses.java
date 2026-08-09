class Solution {
    void helper(int n,int x,int y,List<String>res,String s){
        if(x==n&&y==n){res.add(s);return;}
        if(x<n)helper(n,x+1,y,res,s+'(');
        if(y<x)helper(n,x,y+1,res,s+')');
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,0,0,res,"");
        return res;
    }
}