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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummyless = new ListNode(-1);
        ListNode tl = dummyless;
        ListNode dummygreater = new ListNode(-1);
        ListNode tg = dummygreater;
        while(temp!=null){
            if(temp.val<x){
                tl.next = temp;
                tl = tl.next;
            }
            else{
                tg.next = temp;
                tg = tg.next;
            }
            temp = temp.next;
        }
        tl.next = dummygreater.next;
        tg.next = null;
        head = dummyless.next;
        return head;
    }
}