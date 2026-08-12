/*
Problem: String Duplicates Removal
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    String removeDuplicates(String s) {
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        
        StringBuilder ans = new StringBuilder();
        for(char ele: set){
            ans.append(ele);
        }
        return ans.toString();
    }
}
