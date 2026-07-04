class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] a = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            a[sentence.charAt(i)-'a']=true;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(a[i])c++;
        }
        return c==26;

    }
}