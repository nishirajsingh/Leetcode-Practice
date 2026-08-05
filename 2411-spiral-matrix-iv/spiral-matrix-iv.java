/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                res[i][j]=-1;
            }
        }
        // int n = x.length;
        // int m= x[0].length;
        int a=0,b=m-1,c=0,d=n-1;
        ListNode temp=head;
        while(temp!=null && a<=b && c<=d){
            for(int i=c;i<=d;i++){
                if (temp == null) break;
                res[a][i]=temp.val;
                temp= temp.next;
            }
            a++;
            for(int i=a;i<=b;i++){
                if (temp == null) break;
                res[i][d]=temp.val;
                temp= temp.next;

            }
            d--;
            if(a<=b){
            for(int i=d;i>=c;i--){
                if (temp == null) break;
                res[b][i]=temp.val;
                temp= temp.next;
            }
            b--;
        }
        if(c<=d){
            for(int i=b;i>=a;i--){
                if (temp == null) break;
                res[i][c]=temp.val;
                temp= temp.next;
            }
            c++;
        }
        }
        return res;
    }
}