class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] a = paragraph.toLowerCase().split("[^a-zA-Z0-9]+");;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            boolean isBanned = false;
            for(int j =0;j<banned.length;j++){
                if(a[i].equals(banned[j])){
                    isBanned = true;
                    break;
                }
            }
            if(!isBanned)map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int mx = 0;
        String w="";
        for(String s:map.keySet()){
            if(mx<map.get(s)){
                w=s;
                mx=map.get(s);
            }
        }
        return w;
    }
}