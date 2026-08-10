/*
Problem: Change the Case based on First Character
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    String modify(String s) {
        
        int val = (int) s.charAt(0);
        String snew = "";
        if(65<=val && val<=90) snew=s.toUpperCase();
        else snew=s.toLowerCase();
        return snew;
        
    }
}
