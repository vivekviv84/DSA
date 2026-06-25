1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummy = new ListNode();
4        ListNode res = dummy;
5        int total = 0, carry = 0;
6
7        while (l1 != null || l2 != null || carry != 0) {
8            total = carry;
9
10            if (l1 != null) {
11                total += l1.val;
12                l1 = l1.next;
13            }
14            if (l2 != null) {
15                total += l2.val;
16                l2 = l2.next;
17            }
18
19            int num = total % 10;
20            carry = total / 10;
21            dummy.next = new ListNode(num);
22            dummy = dummy.next;
23        }
24
25        return res.next;        
26    }
27}