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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode temp = slow.next;
        ListNode prev = null;
        slow.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode dummyTemp = dummy;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        ListNode tempMain = head;
        while(prev!=null){
            dummyTemp.next = tempMain;
            dummyTemp = tempMain;
            tempMain = tempMain.next;
            dummyTemp.next = prev;
            dummyTemp = prev;
            prev = prev.next;
        }
        if(tempMain!=null)dummyTemp.next = tempMain;
        head = dummy.next;
    }
}