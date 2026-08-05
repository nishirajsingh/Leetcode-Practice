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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head.next;
        ListNode prev = head;
        while(head!=null && head.next!=null && head.val==head.next.val){
            int copy = head.val;
            while(head!=null && head.val == copy){
                head=head.next;
            }
        }
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val){
                int copy = temp.val;
                while(temp!=null && temp.val == copy){
                    temp=temp.next;
                }
                prev.next =temp;
            }else{

            prev = temp;
            temp =temp.next;
            }
        }
        return head;
    }
}