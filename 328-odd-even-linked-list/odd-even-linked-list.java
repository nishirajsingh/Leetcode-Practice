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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode dummyOdd = new ListNode(-1);
        ListNode to = dummyOdd;
        ListNode dummyEven = new ListNode(-1);
        ListNode te = dummyEven;
        int c =0;
        while(temp!=null){
            c++;
            if(c%2==0){
                te.next = temp;
                te= te.next;
            }
            else{
                to.next = temp;
                to= to.next;
            }
            temp =temp.next;
        }
        to.next = dummyEven.next;
        te.next = null;
        head = dummyOdd.next;
        return head;
    }
}