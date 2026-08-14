/*
Problem: Recursively Sum n Numbers
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int recursiveSum(int n) {
        
        if(n==0) return 0;
        return n+recursiveSum(n-1);
        
    }
}
