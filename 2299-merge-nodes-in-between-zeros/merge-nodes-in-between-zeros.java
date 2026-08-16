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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode next = temp;
        while(temp!=null){
            int s = 0;
            while(next.val!=0){
                s+= next.val;
                next = next.next;
            }
            temp.val = s;
            next = next.next;
            temp.next = next;
            temp = temp.next;
        }
        return head.next;
        
    }
}