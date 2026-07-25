/*
Problem: Sorted Insert Position
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsertK(int arr[], int k) {
        
        //find lower bound
        int low = 0;
        int high = arr.length-1;
        int idx = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=k){
                idx = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return idx;
        
    }
};
