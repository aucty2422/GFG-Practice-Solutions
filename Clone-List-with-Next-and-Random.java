/*
Problem: Clone List with Next and Random
Time Complexity: O(n)
Space Compllexity: O(1)
*/

class Solution {
    public Node cloneLinkedList(Node head) {
        //1. Insert copy nodes in between original nodes
        Node temp = head;
        while(temp!=null){
            Node front = temp.next;
            Node newNode = new Node(temp.data);
            temp.next = newNode;
            newNode.next= front;
            temp = front;
        }
        //2. Connecting random pointers
        Node current = head;
        while(current!=null ){
            if(current.random!=null){
                current.next.random = current.random.next;
            }else{
                current.next.random = null;
            }
            current = current.next.next;
        }
        //3. Separate the list
        temp = head;
        Node answer = head.next;
        while(temp!=null && temp.next!=null){
            Node front = temp.next;
            temp.next = front.next;
            if(temp.next!=null) front.next = temp.next.next; 
            temp = temp.next;
            
        }
        
        return answer;
        
    }
}
