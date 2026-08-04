/*
Problem: Insert at Middle of Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public Node insertInMiddle(Node head, int x) {
        
        Node newNode = new Node(x);
        // Handle empty linked list
        if(head==null) return newNode;
        
        // Start fast one step ahead so slow stops at the first middle
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node front = slow.next;
    
        slow.next=newNode;
        newNode.next = front;
        return head;
    }
}
