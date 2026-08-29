/*
Problem: Remove Duplicates from a Sorted Linked List
Time Compelexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    Node removeDuplicates(Node head) {
        
        Node temp = head;
        Node prev = head;
        
        while(temp!=null){
            if(temp.data!=prev.data){
                prev.next=temp;
                prev=temp;
            }
            temp=temp.next;
        }
        prev.next=null;
        return head;
        
    }
}
