/*
Problem: Nth Fibonacci Number
Time Complexity:  O(2^n)
Space Complexity: O(n)
*/


class Solution {
    static int fib(int n){
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fib(n-1)+fib(n-2);
        
        
    }
    static int nthFibonacci(int n) {
        
        return fib(n);
        
    }
}
