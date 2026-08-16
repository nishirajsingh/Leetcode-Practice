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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1;
        ListNode next = list1;
        ListNode temp1 = list1;
        ListNode temp2= list2;
        int c = 0;
        while(temp1!=null){
            c++;
            if(c==a) prev = temp1;
            if(c==b+2)next = temp1;
            temp1 = temp1.next;
        }
        prev.next = list2;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = next;
        return list1;
        
    }
}