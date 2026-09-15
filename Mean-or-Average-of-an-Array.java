/*
Problem: Mean or Average of an Array
Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public static int findMean(int[] arr) {
        
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (int) sum/arr.length;
        
    }
}
