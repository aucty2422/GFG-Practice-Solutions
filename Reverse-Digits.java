/*
Problem: Reverse Digits
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int reverseDigits(int n) {
        
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev=10*rev+rem;
            n/=10;
        }
        return rev;
    }
}
