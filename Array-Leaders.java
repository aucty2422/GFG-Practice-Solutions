/*
Problem: Array Leaders
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        int j = arr.length-1;
        int maxi = arr[j];
        while(j>=0){
            if(arr[j]>=maxi){
                maxi = arr[j];
                ans.add(maxi);
            }
            j--;
        }
        
        Collections.reverse(ans);
        return ans;
        
        
    }
}
