/*
Problem: Intersection in Y Shaped Lists
Time Complexity: O(m+n)
Space Complexity: O(1)
*/
class Solution {
    public Node intersectPoint(Node headA,Node headB) {
        int lenA=0;
        int lenB=0;
        Node tempA = headA;
        Node tempB = headB;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }

        int diff = Math.abs(lenA-lenB);
        tempA = headA;
        tempB = headB;
        if(lenA>=lenB){
            for(int i=0;i<diff;i++){
                tempA=tempA.next;
            }
        }else{
            for(int i=0;i<diff;i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=null){
            if(tempA==tempB) return tempA;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
        
    }
}
