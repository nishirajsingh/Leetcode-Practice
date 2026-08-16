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
    public int numComponents(ListNode head, int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i:nums)map.put(i,true);
        int c =0;
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp.val)&&(temp.next==null || !map.containsKey(temp.next.val)))c++;
            temp = temp.next;
        }
        return c;
        
    }
}