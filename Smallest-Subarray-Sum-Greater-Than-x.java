/*
Problem: Smallest Subarray Sum Greater Than x
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
    
        int minLen = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum = 0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>x){
                sum-=arr[i];
                minLen=Math.min(minLen,j-i+1);
                i++;
            }
            j++;
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
        
        
        
    }
}
