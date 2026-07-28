/*
Problem: Find nth root of m
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int nthRoot(int n, int m) {
        
        int low = 0;
        int high = m;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)Math.pow(mid,n)==m){
                ans = mid;
                break;
            }else if((long)Math.pow(mid,n)<m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
        
    }
}
