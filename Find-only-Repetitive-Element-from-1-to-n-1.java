/*
Problem: Find only Repetitive Element from 1 to n-1
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findDuplicate(int[] arr) {
        
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor^=i;
            xor^=arr[i];
        }
        return xor;
        
    }
}
