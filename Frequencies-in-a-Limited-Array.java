/*
Problem: Frequencies in a Limited Array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public ArrayList<Integer> frequencyCount(int[] nums) {
        
        int[] arr = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
