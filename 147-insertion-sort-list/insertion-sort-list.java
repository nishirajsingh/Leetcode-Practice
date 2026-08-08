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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode temp = null;
        while (head != null) {
            ListNode next = head.next;
            if (temp==null||head.val<=temp.val) {
                head.next = temp;
                temp = head;
            } 
            else {
                ListNode find = temp;
                while (find.next != null && find.next.val < head.val) {
                    find = find.next;
                }
                head.next = find.next;
                find.next = head;
            }
            head = next;
        }

        return temp;
        
    }
}