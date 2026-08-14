/*
Problem: Power using Recursion
Time Complexity: O(log n)
Space Complexity: O(log n)
*/

class Solution {
    public static int power(int n,int p){
        if(p==0) return 1;
        int call = power(n,p/2);
        if(p%2==0) return call*call;
        return call*call*n;
    }
    public int recursivePower(int n, int p) {
        
        return power(n,p);
        
        
    }
}
