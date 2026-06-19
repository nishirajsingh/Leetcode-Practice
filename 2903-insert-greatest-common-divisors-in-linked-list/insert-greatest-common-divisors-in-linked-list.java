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
    public int GCD(int a,int b){
        if(b==0)return a;
        return GCD(b,a%b);

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode a = head;
        while(a!=null && a.next!=null){
            ListNode gcdNode= new ListNode(GCD(a.val,a.next.val));
            gcdNode.next = a.next;
            a.next = gcdNode;
            a=gcdNode.next;
        }
        return head;
    }
}