/*
Problem: Doubly Linked List Traversal
Time Complexity: O(n)
Space Complexity: O(n), for storing the answer
*/

class Solution {
    public List<List<Integer>> displayList(Node head) {
        
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> fwd = new ArrayList<>();
        
        Node temp = head;
        Node back = null;
        while(temp!=null){
            fwd.add(temp.data);
            back = temp;
            temp=temp.next;
        }
        
        ArrayList<Integer> bwd = new ArrayList<>();
        while(back!=null){
            bwd.add(back.data);
            back=back.prev;
        }
        
        ans.add(fwd);
        ans.add(bwd);
        return ans;
    }
}
