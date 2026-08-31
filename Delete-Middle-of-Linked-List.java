/*
Problem: Delete Middle of Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public Node deleteMid(Node head) {
        
        if(head.next==null ) return null;
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        return head;
        
    }
}
