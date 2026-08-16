/*
Problem: Average of Prefixes
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] prefixAvg(int[] arr) {
        
        int[] ans = new int[arr.length];
        int pre=0;
        for(int i=0;i<arr.length;i++){
            pre+=arr[i];
            ans[i]=pre/(i+1);
        }
        return ans;
        
    }
}
