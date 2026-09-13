/*
Problem: Insertion in Empty Circular List
Time Complexity: O(1)
Space Complexity: O(1)
*/
class Solution {
    public Node insertIntoEmpty(Node last, int data) {
        
        Node newNode = new Node(data);
        newNode.next = newNode;
        return newNode;
        
    }
}
