/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node curr = head;

        while(curr != null){
            Node copynode = new Node(curr.val);
            copynode.next = curr.next;
            curr.next = copynode;
            curr = curr.next.next;
        }

        curr =head;

        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;}
            curr = curr.next.next;
        }

        curr =head;
        Node copyhead = head.next;
        Node copy = copyhead;

        while(curr != null){
            curr.next = curr.next.next;
            if(copy.next !=null){
                copy.next = copy.next.next;}
            
            curr = curr.next;
            copy = copy.next;
        }

        return copyhead;
    }
}