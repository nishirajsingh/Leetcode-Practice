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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null && c<k){
            c++;
            temp = temp.next;
        }
        temp = head;
        ListNode prev = null;
        if(c==k){
            ListNode next = null;
            for(int i=0;i<k;i++){
                next = temp.next;
                temp.next = prev;
                prev= temp;
                temp = next;
            }
            head.next = reverseKGroup(temp,k);
            return prev;
        }
        return head;
    }
}