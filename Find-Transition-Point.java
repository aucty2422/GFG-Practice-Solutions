/*
Problem: Find Transition Point
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    int transitionPoint(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) return i;
        }
        return -1;
        
    }
}
