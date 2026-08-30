/*
Problem: Cycle Length in Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int lengthOfLoop(Node head) {
        
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                int len=1;
                slow=slow.next;
                while(slow!=fast){
                    len++;
                    slow=slow.next;
                }
                return len;
            }
                
        }
        return 0;
        
        
    }
}
