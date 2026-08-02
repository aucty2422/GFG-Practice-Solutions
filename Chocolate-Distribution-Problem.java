/*
Problem: Chocolate Distribution Problem
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int findMinDiff(int arr[], int m) {
        
        
        Arrays.sort(arr);
        int i=0;
        int j=m-1;
        int mini=Integer.MAX_VALUE;
        while(j<arr.length){
            mini = Math.min(mini,arr[j]-arr[i]);
            i++;
            j++;
        }
        return mini;
        
        
        
        
    }
}
