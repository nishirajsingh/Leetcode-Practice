class Solution {
    public List<String> braceExpansionII(String expression) {
        int r = expression.indexOf('}');
        if (r == -1) {
            String[] w = expression.split(",");
            Set<String> set = new TreeSet<>(Arrays.asList(w));
            return new ArrayList<>(set);
        }
        
        int l = expression.lastIndexOf('{', r);
        String a = expression.substring(0, l);
        String b = expression.substring(l + 1, r);
        String c = expression.substring(r + 1);
        
        String[] d = b.split(",");
        Set<String> ex = new HashSet<>();
        
        for (String option : d) {
            String newex = a + option + c;
            ex.addAll(braceExpansionII(newex));
        }
        
        List<String> res = new ArrayList<>(ex);
        Collections.sort(res);
        return res;
    }
}