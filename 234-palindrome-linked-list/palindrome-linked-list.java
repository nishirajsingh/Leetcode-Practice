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
    public boolean isPalindrome(ListNode head) {
        ListNode l2 = null;
        ListNode temp = head;
        while(temp!= null){
            l2 = new ListNode(temp.val, l2);
            temp = temp.next;
        }
        temp = head;
        ListNode temp2 = l2;
        while(temp!=null){
            if(temp.val != temp2.val) return false;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return true;
    }
}