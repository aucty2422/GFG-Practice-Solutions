/*
Problem: Digits in Factorial
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
   
    public int digitsInFactorial(int n) {
        
       double cnt=0;
       for(int i=1;i<=n;i++){
           cnt+=Math.log10(i);
       }
       
       return (int)cnt + 1;
    }
}
