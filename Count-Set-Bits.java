/*
Problem: Count Set Bits
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    static int setBits(int n) {
        
        int cnt = 0;
        while(n>0){
            if((n&1)==1) cnt++;
            n=n>>1;
        }
        return cnt;
        
    }
}
