/*
Problem: Union of Two Linked Lists
Time Complexity: O(m+n)
Space Complexity: O(m+n)
*/

class Solution {
    public Node makeUnion(Node head1, Node head2) {
        
        Node temp1 = head1;
        Node temp2 = head2;
        HashSet<Integer> set = new HashSet<>();
        Node ansNode = new Node(-1);
        Node dummy = ansNode;
        while(temp1!=null){
            if(!set.contains(temp1.data)){
                Node newNode = new Node(temp1.data);
                dummy.next = newNode;
                dummy = newNode;
            }
            set.add(temp1.data);
            temp1=temp1.next;
        }
        
        while(temp2!=null){
            if(!set.contains(temp2.data)){
                Node newNode = new Node(temp2.data);
                dummy.next = newNode;
                dummy = newNode;
            }
            set.add(temp2.data);
            temp2=temp2.next;
        }
        return ansNode.next;
        
        
    }
}
