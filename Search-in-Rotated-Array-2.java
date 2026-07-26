/*
Problem: Search in Rotated Array 2
Time Complexity: O(log n) average, O(n) worst case
Space Complexity: O(1)
*/

class Solution {
    public boolean search(int[] arr, int key) {
        
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
          //Key found
            if(arr[mid]==key) return true;
          //Handle duplicates
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
          //Determine which half is sorted
            if(arr[low]<=arr[mid]){
                if(arr[low]<=key && key<=arr[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }else{
                if(arr[mid]<key && key<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
        
    }
}
