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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        ListNode prev = null;
        int c =0;
        if(n==1)return null;
        if(n==2){
            head.next = null;
        }else{

        while(temp!=null){
            c++;
            if(c==n/2+1){
                prev.next = temp.next;
                temp.next = null;
                break;
            }
            prev= temp;
            temp = temp.next;
        }
        }
        return head;
    }
}