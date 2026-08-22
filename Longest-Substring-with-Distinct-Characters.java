/*
Problem: Longest Substring with Dsitinct Characters
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int longestUniqueSubstr(String s) {
        
        HashMap<Character,Integer>map = new HashMap<>();
        int maxLen = 0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int l = map.get(ch);
                map.put(ch,j);
                i=Math.max(i,l+1);
            }
            map.putIfAbsent(ch,j);
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        
        return maxLen;
        
        
    }
}
