/*
Problem: Minimum Integer
Time Complexity: O(n)
Space Complexity:O(1)
*/
class Solution {
    public int minimumInteger(int[] arr) {
        
        long sum=0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(sum<=(long) arr.length*arr[i]){
                ans = Math.min(arr[i],ans);
            }
        }
        return ans;
        
        
    }
}
