/*
Problem: Koko Eating Bananas
Time Complexity: O(n * log (max(arr)))
Space Complexity: O(1)
*/

class Solution {
    public int hours(int[] arr, int mid){
        int hrs = 0;
        for(int i=0;i<arr.length;i++){
           hrs += (int) Math.ceil((double) arr[i]/mid);
        }
        return hrs;
    }
    public int kokoEat(int[] arr, int k) {
        
        int high = 0;
        for(int i=0;i<arr.length;i++){
            high = Math.max(high,arr[i]);
        }
        
        int ans =0;
        int low = 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(hours(arr,mid)<=k){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
            
        }
        
        return ans;
    }
}
