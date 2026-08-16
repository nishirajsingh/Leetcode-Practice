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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n =0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        ListNode[] res = new ListNode[k];
        temp =head;
        int ex = n%k;
        for(int i=0;i<k;i++){
            if(temp ==null){
                res[i]=null;
                continue;
            }
            res[i]=temp;
            int a = ex>0?1:0;
            ex--;
            for(int j =0;j<((n/k)+a)-1;j++){
                if(temp!=null)temp=temp.next;
            }
            ListNode next = temp.next;
            temp.next = null;
            temp = next;

        }
        return res;
        
    }
}