class Solution {
    public String[] findWords(String[] words) {
    int[] map = new int[128];
    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    
    for (int i = 0; i < rows.length; i++) {
        for (char c : rows[i].toCharArray()) {
            map[c] = i;
            map[Character.toUpperCase(c)] = i;
        }
    }

    List<String> res = new ArrayList<>();
    for (String s : words) {
        if (s.isEmpty()) continue;
        int targetRow = map[s.charAt(0)];
        boolean isValid = true;
        
        for (int i = 1; i < s.length(); i++) {
            if (map[s.charAt(i)] != targetRow) {
                isValid = false;
                break;
            }
        }   
        if (isValid) res.add(s);
    }
    return res.toArray(new String[0]);
}
}