/*
Problem: Nth Fibonacci Using Recursion
Time Complexity: O(2^n)
Space Complexity: O(n)
*/

class Solution {
    static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static int nthFibonacci(int n) {
        
        return fibonacci(n);
        
    }
}
