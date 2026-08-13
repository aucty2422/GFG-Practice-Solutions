/*
Problem: Factorial
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    int factorial(int n) {
        
        return fact(n);
        
    }
}
