/*
Problem: Find Kth Rotation
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int findKRotation(int arr[]) {
        
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int idx=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[low]<=arr[high]){
                if(ans>arr[low]){
                    ans=arr[low];
                    idx=low;
                }
            }
            if(arr[low]<=arr[mid]){
                if(ans>arr[low]){
                    ans=arr[low];
                    idx=low;
                }
                low=mid+1;
            }else{
                if(ans>arr[mid]){
                    ans=arr[mid];
                    idx=mid;
                }
                high = mid-1;
            }
        }
        return idx;
        
    }
}
