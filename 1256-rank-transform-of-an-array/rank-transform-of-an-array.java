class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        int[] res = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx=1;
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i]))
                map.put(a[i],idx++);
        }
        for(int i=0;i<arr.length;i++){
                res[i]=map.get(arr[i]);
        }
        return res;

    }
}