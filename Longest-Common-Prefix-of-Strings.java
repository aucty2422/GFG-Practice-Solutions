/*
Problem: Longest Common Prefix of Strings
Time Complexity: O(n log n * m)
Space Complexity: O(m)
*/
class Solution {
    public String longestCommonPrefix(String arr[]) {
        
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder("");
        String first = arr[0];
        String last = arr[arr.length-1];
        int i=0;
        while(i<first.length() && i<last.length()){
            if(first.charAt(i)==last.charAt(i)){
                ans.append(first.charAt(i));
                i++;
            }else break;
        }
        return ans.toString();
        
    }
}
