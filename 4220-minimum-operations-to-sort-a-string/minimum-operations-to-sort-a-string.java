class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if (n <= 1) return 0;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String temp = new String(ch);
        if(s.equals(temp)) return 0;
        if (n == 2) return -1;
        if(s.charAt(0)==temp.charAt(0) || s.charAt(n-1) == temp.charAt(n-1)) return 1;
        boolean flag = false;
        for(int i=1;i<n-1;i++) {
            if(s.charAt(i)==temp.charAt(0) || s.charAt(i)==temp.charAt(n-1)) {
                flag = true;
                break;
            }
        }
        if(!flag && s.charAt(0)==temp.charAt(n-1) && s.charAt(n-1)==temp.charAt(0)) return 3;
        return 2;
    }
}