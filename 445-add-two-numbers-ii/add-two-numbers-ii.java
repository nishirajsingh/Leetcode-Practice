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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode dummyTemp = dummy;
        while(temp1!=null || temp2!=null|| c!=0){
            int d1=0,d2=0;
            if(temp1!=null)d1 = temp1.val;
            if(temp2!=null)d2 = temp2.val;
            int d = d1+d2+c;
            c = d/10;
            d = d%10;
            dummyTemp.next = new ListNode(d);
            dummyTemp = dummyTemp.next;
            if(temp1!=null)temp1 = temp1.next;
            if(temp2!=null)temp2 = temp2.next;
        }
        return reverse(dummy.next);
    }
}