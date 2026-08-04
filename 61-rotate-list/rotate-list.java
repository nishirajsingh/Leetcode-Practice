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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)return head;
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        int mainK = k%c;
        for(int i=0;i<mainK;i++){
            ListNode temp2= head;
            ListNode prev = null;
            while(temp2.next!=null){
                prev = temp2;
                temp2=temp2.next;
            }
            prev.next = null;
            temp2.next =head;
            head = temp2;
        }
        return head;
    }
}