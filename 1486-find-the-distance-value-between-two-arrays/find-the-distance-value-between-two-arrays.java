class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for(int num:arr1){
            boolean a = true;
            for(int i :arr2){
                if(Math.abs(num-i)<=d){a = false;break;}
            }
            if(a)c++;
        }
        return c;
    }
}