/*
Problem: Indexes of Subarray Sum
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
       
       //list to store ans
       ArrayList<Integer> ans = new ArrayList<>();
       
       
       //Sliding Window (Two-pointers) approach
       
       int start = 0;
       int end = 0;
       int sum = 0;

       while(end<arr.length){
           sum+=arr[end];
           while(sum>target){
               sum=sum-arr[start];
               start++;
           }
           if(sum==target){
               ans.add(start+1);
               ans.add(end+1);
               return ans;
           }
           end++;
       }
       
       return new ArrayList<>(Arrays.asList(-1));
       
       
       
       
       
    }
}
