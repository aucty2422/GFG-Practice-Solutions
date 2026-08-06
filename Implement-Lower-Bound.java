/*
Problem: Implement Lower Bound
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    int lowerBound(int[] arr, int target) {
        
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        if(target>arr[high]) return arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                ans = mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;
    }
}
