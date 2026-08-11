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
    public ListNode sortList(ListNode head) {
        if(head==null)return null;
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        ListNode h1 = new ListNode(arr.get(0));
        ListNode temp1 = h1;
        for(int i=1;i<arr.size();i++){
            ListNode newNode = new ListNode(arr.get(i));
            temp1.next = newNode;
            temp1 = newNode;

        }
        return h1;
    }
}