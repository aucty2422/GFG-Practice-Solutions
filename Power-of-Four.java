/*
Problem: Power of Four
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}
