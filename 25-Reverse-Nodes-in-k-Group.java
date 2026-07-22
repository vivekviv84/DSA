class Solution {

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode curr = head;
        ListNode newHead = null;
        ListNode prevTail = null;

        while (curr != null) {

            // Find kth node
            ListNode kth = curr;

            for (int i = 1; i < k && kth != null; i++) {
                kth = kth.next;
            }

            // Less than k nodes left
            if (kth == null) {
                if (prevTail != null)
                    prevTail.next = curr;
                break;
            }

            // Save next group
            ListNode nextGroup = kth.next;

            // Break the list
            kth.next = null;

            // Reverse current group
            ListNode reversedHead = reverse(curr);

            // First reversed group
            if (newHead == null) {
                newHead = reversedHead;
            }

            // Connect previous group
            if (prevTail != null) {
                prevTail.next = reversedHead;
            }

            // Current becomes tail after reverse
            prevTail = curr;

            // Connect tail with remaining list
            curr.next = nextGroup;

            // Move to next group
            curr = nextGroup;
        }

        return newHead == null ? head : newHead;
    }
}