/*
Problem: Longest Common Substring
Time Complexity: O(n^2 * m)
Space Complexity: O(n)
*/

class Solution {
    public int longCommSubstr(String s1, String s2) {
        int maxLen=0;
        for(int i=0;i<s1.length();i++){
            String s ="";
            for(int j=i;j<s1.length();j++){
                s+=s1.charAt(j);
                if(s2.contains(s)){
                    maxLen=Math.max(maxLen,s.length());
                }
            }
        }
        return maxLen;
        
    }
}
