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

        ListNode mid = findmiddle(head);
        ListNode righthead = mid.next;

        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(righthead);

        return merge(left,right);
    }

    public ListNode findmiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode  merge(ListNode left,ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while( left != null && right!= null){
            if(left.val <= right.val){
                tail.next = left;
                left = left.next;
            }
            else{
                tail.next = right;
                right =right.next;
            }

            tail = tail.next;
        }
        if(left != null){
            tail.next = left;
        }

        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }
}