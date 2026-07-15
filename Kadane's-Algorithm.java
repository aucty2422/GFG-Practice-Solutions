/* 
Problem: Kadane's Algorithm
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    int maxSubarraySum(int[] arr) {
        
        int maxi = arr[0];
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0) sum =0;
        }
        return maxi;
    }
}
