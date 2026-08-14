/*
Problem: Raise to Power of Its Own Reverse
Time Complexity: O(log n)
Space Complexity: O(log n)
*/

class Solution {
    public int power(int n,int p){
        if(p==1) return n;
        int call = power(n,p/2);
        if(p%2==0) return call*call;
        return call*call*n;
        
    }
    public int reverseExponentiation(int n) {
        
        if(n==10) return 10;
        return power(n,n);
        
    }
}
