/*
Problem: Longest Word
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String longest(String[] arr) {
        
        String ans = "";
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            if(maxLen < s.length()){
                maxLen = s.length();
                ans = s;
            }
        }
        return ans;
    }
}
