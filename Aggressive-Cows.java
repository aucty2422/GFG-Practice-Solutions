/*
Problem: Aggressive Cows
Time Complexity: O(n * log(n) + n * log(max(arr) - min(arr)))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPossible(int[] arr, int mid, int k){
        k--;
        int prev = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] - prev>=mid){
                k--;
                prev = arr[i];
            }
        }
        return k<=0;
    }
    public int aggressiveCows(int[] arr, int k) {
    
        Arrays.sort(arr);
        int ans = 0;
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(arr,mid,k)){
                ans = mid;
                low = mid + 1;
            }else high = mid-1;
        }
        return ans;
        
        
        
        
    }
}
