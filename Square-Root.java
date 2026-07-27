/*
Problem: Square Root
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    int floorSqrt(int n) {
        
        int low = 1;
        int high = n;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)mid*mid<=n){
                ans = mid;
                low=mid+1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
