/*
Problem: Palindrome Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(Node head) {
        
        //find middle
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse part after middle
        Node temp = slow.next;
        Node back = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        //two-pointer appraoch
        Node ptr1 = head;
        Node ptr2 = back;
        while(ptr2!=null){
            if(ptr1.data!=ptr2.data) return false;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;
        
        
        
        
    }
}
