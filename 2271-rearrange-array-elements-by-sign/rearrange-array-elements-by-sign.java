class Solution {
    public int[] rearrangeArray(int[] arr) {
        // int i = 0;
        // int j = 1;
        // int n = arr.length;
        // while (i<n && j<n) {
        //     if (arr[i]>0) {
        //         i+=2; 
        //     } else if (arr[j]< 0) {
        //         j+=2; 
        //     } else {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i+=2;
        //         j+=2;
        //     }
        // }
        // return arr;
        int i=0,j=1;
        int [] a = new int[arr.length];
        for(int num:arr){
            if(num>0) {
                a[i] = num;
                i+=2;
            }
            else if (num<0) {
                a[j]= num;
                j+=2;
            }
        }
        return a;
    }
}