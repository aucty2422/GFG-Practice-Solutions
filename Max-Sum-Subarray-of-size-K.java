/*
Problem: Max Sum Subarray of size K
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
       }
       
      int i=0;
      int j=k-1;
      int maxSum = sum;
      while(j<arr.length){
          sum-=arr[i++];
          j++;
          if(j==arr.length) break;
          sum+=arr[j];
          maxSum=Math.max(sum,maxSum);
      }
        return maxSum;
       
    }
}
