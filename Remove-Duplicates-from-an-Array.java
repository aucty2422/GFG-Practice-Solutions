/*
Problem: Remove Duplicates from an array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        return new ArrayList<>(set);
        
    }
}
