class Solution {
    public String toGoatLatin(String s) {
        StringBuilder sb = new StringBuilder();
        int w = 1;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (isVowel(s.charAt(j))) {
                    sb.append(s.substring(j, i) + "m" + "a".repeat(1 + w));
                } else {
                    sb.append(s.substring(j + 1, i) + s.charAt(j) + "m" + "a".repeat(1 + w));
                }
                sb.append(" ");
                j = i + 1;
                w++;
            }
        }
        if (isVowel(s.charAt(j))) {
            sb.append(s.substring(j, s.length()) + "m" + "a".repeat(1 + w));
        } else {
            sb.append(s.substring(j + 1, s.length()) + s.charAt(j) + "m" + "a".repeat(1 + w));
        }
        return sb.toString();
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}