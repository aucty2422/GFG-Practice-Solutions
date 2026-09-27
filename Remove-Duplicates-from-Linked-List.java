/*
Problem:  Remove Duplicates from Linked List
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public Node removeDuplicates(Node head) {
        
        Node temp = head;
        HashSet<Integer> set = new HashSet<>();
        Node dummy = new Node(-1);
        dummy.next = head;
        Node back = dummy;
        while(temp!=null){
            if(set.contains(temp.data)){
                back.next=temp.next;
            }else{
                set.add(temp.data);
                back=temp;
            }
            temp=temp.next;
        }
        return dummy.next;
        
    }
}
