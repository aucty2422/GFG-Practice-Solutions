/*
Problem: Count Digits in a Number
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public static int countDigits(int n) {
        
        int cnt = 0;
        while(n>0){
            int rem = n%10;
            cnt++;
            n=n/10;
        }
        
        return cnt;
    }
}
