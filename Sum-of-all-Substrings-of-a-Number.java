/*
Problem: Sum of all substrings of a number
TIme Complexity: O(n*n);
Space Complexity: O(1)
*/

class Solution {
    public static int sumSubstrings(String s) {
       
        int sum = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int val = Integer.parseInt(s.substring(i,j+1));
                sum+=val;
            }
        }
        return sum;
        
    }
}
