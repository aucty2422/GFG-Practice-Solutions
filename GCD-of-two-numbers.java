/*
Problem: GCD of two numbers
Time Complexity: O(log (max(a,b)))
Space Complexity: O(log(max(a,b)))
*/

class Solution {
    public static int hcf(int a,int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }
    public static int gcd(int a, int b) {

        return hcf(a,b);
        
    }
}
