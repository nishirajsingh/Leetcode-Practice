class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i=0;i<words.length;i++) {
            if(this.isSubstring(words, i)) {
                result.add(words[i]);
            }
        }

        return result;
    }

    private boolean isSubstring(String[] words, int i) {
        String s = words[i];

        for (int j = 0; j < words.length; j++) {
            if (i != j && words[j].contains(s)) {
                return true;
            }
        }

        return false;
    }
}