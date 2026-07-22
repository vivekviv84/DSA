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

        if(head == null || head.next == null){
            return head;
        }

        ArrayList<Integer> value = new ArrayList<>();
        
        ListNode curr = head;
        while(curr != null){
            value.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(value);
        ListNode prev = head;

        for(int val: value){
            prev.val = val;
            prev = prev.next;
        }
        return head;
    }
}