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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int k = 0;
        while(temp!=null){
            k++;
            temp=temp.next;
        }
        if(head.next==null || head==null)return null;
        temp = head;
        ListNode prev = null;
        int c =0;
        while(temp!=null){
            c++;
            if(c == k-n+1){
                if(prev==null){
                    return head.next;
                }
                prev.next = temp.next;
            }
            prev = temp;
            temp= temp.next;
        }
        return head;

    }
}