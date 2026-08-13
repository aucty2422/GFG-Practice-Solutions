/*
Problem: Trailing zeroes in factorial
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public static int trailingZeroes(int n) {
        
        int n1=n;
        int n2=n;
        int cnt2=0;
        int cnt5=0;
        while(n1>0){
            cnt2+=n1/2;
            n1/=2;
        }
        while(n2>0){
            cnt5+=n2/5;
            n2/=5;
        }
        return Math.min(cnt2,cnt5);
        
    }
}
