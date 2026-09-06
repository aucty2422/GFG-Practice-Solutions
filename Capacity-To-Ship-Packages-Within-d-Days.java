/*
Problem: Capacity To Ship Packages Within d Days
Time Complexity: O(n * log m)
Space Complexity: O(1)
*/

class Solution {
    public int days(int mid, ArrayList<Integer> arr){
        int days = 0;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum>mid){
                sum=arr.get(i);
               days++;
           }
       }
       days++;
       return days;
    }
    
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        
        
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.size();i++){
            low = Math.max(low,arr.get(i));
            high+=arr.get(i);
        }
        int ans = Integer.MAX_VALUE;
       while(low<=high){
           int mid = low + (high-low)/2;
 
           if(days(mid,arr)<=d){
               ans=mid;
               high = mid-1;
           }else{
               low=mid+1;
           }
       }
       return ans;
        
    }
}
