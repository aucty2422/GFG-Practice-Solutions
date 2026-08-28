/*
Problem: Length of Circular Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public static int getLength(Node head) {
        
        Node slow = head;
        int len=1;
        while(slow.next!=head){
            len++;
            slow = slow.next;
        }
        return len;
        
    }
}
