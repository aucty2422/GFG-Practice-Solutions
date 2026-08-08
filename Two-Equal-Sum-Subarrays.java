/*
Problem: Two Equal Sum Subarrays
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean canSplit(int arr[]) {
        
        int i=0;
        int j=arr.length-1;
        int lsum=arr[i];
        int rsum=arr[j];
        while(i<j){
            if(lsum<rsum){
                i++;
                lsum+=arr[i];
            }else if(lsum>rsum){
                j--;
                rsum+=arr[j];
            }else{
                if(j-i==1) return true;
                i++;
                lsum+=arr[i];
            }
        }
        return false;
        
    }
}
