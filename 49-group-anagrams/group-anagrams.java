class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for(int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        for(int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] isVisit = new boolean[strs.length];
        for(int i = 0;i<strs.length;i++){
            List<String> a = new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                if(!isVisit[j]){
                    if(isAnagram(strs[i],strs[j])){
                        a.add(strs[j]);
                        isVisit[j]=true;
                    }
                }
            }
            if(!a.isEmpty()){
                res.add(a);
            }
        }
        return res;
        
    }
}