/*
Problem: Product Array Puzzle
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int res = 1;
        int cnt0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0++;
                continue;
            }
            res*=arr[i];
        }
        
        int[] ans = new int[arr.length];
        
        if(cnt0>1){
            for(int i=0;i<arr.length;i++){
                ans[i]=0;
            }
        }else if(cnt0==1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    ans[i]=res;
                }
                else ans[i]=0;
            }
        }else{
            for(int i=0;i<arr.length;i++){
                ans[i]=res/arr[i];
            }
        }
        
        return ans;
        
    }
}
