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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode a = temp;
        int c = 0;
        while(l1!=null || l2!=null || c!=0){
            int l1sum=0,l2sum=0;
            if(l1!=null) l1sum=l1.val;
            if(l2!=null) l2sum=l2.val;
            int sum = l1sum+l2sum+c;
            c = sum/10;
            a.next = new ListNode(sum%10);
            a=a.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        return temp.next;

    }
}