/*
Problem: Remove Loop In LinkedList
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static void removeLoop(Node head) {
        
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            prev=fast.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    prev = fast;
                    slow=slow.next;
                    fast = fast.next;
                }
                prev.next=null;
            }
        }
    }
}

