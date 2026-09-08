/*
Problem: Smallest Divisor
Time Complexity: O(n * log(max(arr)))
Space Complexity: O(1)
*/

class Solution {
    public int sumQuo(int[] arr, int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/mid);
        }
        return sum;
    }
    
    int smallestDivisor(int[] arr, int k) {
        
        int high = 0;
        for(int i=0;i<arr.length;i++){
            high = Math.max(arr[i],high);
        }
        int ans = 0;
        int low = 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum = sumQuo(arr,mid);
            if(sum<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
