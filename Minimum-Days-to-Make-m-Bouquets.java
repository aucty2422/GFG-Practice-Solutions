/*
Problem: Minimum Days to Make m Bouquets
Time Complexity: O(n * log(max(arr)))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPossible(int[] arr, int mid, int k,int m){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) cnt++;
            else cnt=0;
            
            if(cnt==k){
                m--;
                cnt=0;
            }
        }
        return m<=0;
    }
    
    public int minDaysBloom(int[] arr, int k, int m) {
        
        if((long) arr.length < (long) k*m) return -1;
        
        int low = arr[0];
        int high = 0;
        for(int i=0;i<arr.length;i++){
            low = Math.min(low,arr[i]);
            high = Math.max(high,arr[i]);
        }
        
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(arr,mid,k,m)){
                ans = mid;
                high=mid-1;
            }else low = mid+1;
            
        }
        return ans;
        
    }
}
