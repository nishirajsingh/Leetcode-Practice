class Solution {
    public String[] findWords(String[] words) {
        String q="qwertyuiopQWERTYUIOP";
        String a="asdfghjklASDFGHJKL";
        String z="zxcvbnmZXCVBNM";
        List<String> res = new ArrayList<>();
        for(String s:words){
            if(isValid(s,q)||isValid(s,a)||isValid(s,z)) res.add(s);
        }
        return res.toArray(new String[0]);
    }
    public boolean isValid(String s,String t){
        for(int i=0;i<s.length();i++){
            if((t.indexOf(s.charAt(i))==-1)) return false;
        }
        return true;
    }
}