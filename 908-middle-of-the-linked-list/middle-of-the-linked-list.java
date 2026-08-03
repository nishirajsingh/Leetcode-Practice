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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        ListNode temp2 = head;
        int c = 0;
        while(temp2!=null){
            c++;
            if(c == n/2){
                head = temp2.next;
            }
            temp2 = temp2.next;
        }
        return head;
        
    }
}