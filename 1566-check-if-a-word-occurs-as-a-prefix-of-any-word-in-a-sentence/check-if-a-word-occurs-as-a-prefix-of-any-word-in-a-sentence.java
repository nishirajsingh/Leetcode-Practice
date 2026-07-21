class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        boolean a = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>=searchWord.length()){
                for(int j = 0;j<searchWord.length();j++){
                    if(arr[i].charAt(j)!=searchWord.charAt(j)){
                        a = false;
                        break;
                    }else a = true;
                }
                if(a) return i+1;
            }
        }
        return -1;
    }
}