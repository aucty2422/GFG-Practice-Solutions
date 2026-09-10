/*
Problem: Allocate Minimum Pages
Time Complexity: O(n * log(sum(arr)))
Space Complexity: O(1)
*/
class Solution {
    public boolean isPossible(int[] arr,long mid, int k){
        int cnt = 1;
        long pages = 0;
        for(int i=0;i<arr.length;i++){
            pages+=arr[i];
            if(pages>mid){
                cnt++;
                pages = arr[i];
            }
        }
        return cnt<=k;
    }
    public int findPages(int[] arr, int k) {
        
        if(k>arr.length) return -1;
        long low = 0;
        long high = 0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        long ans = 0;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(isPossible(arr,mid,k)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return (int)ans;
        
        
        
        
        
    }
}
