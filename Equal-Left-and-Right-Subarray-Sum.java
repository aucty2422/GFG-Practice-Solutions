/*
Problem: Equal Left and Right Subarray Sum
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    int equalSum(int[] arr) {
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        int pre=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(pre==sum) return i;
            pre+=arr[i];
        }
        return -1;
        
    }
}
