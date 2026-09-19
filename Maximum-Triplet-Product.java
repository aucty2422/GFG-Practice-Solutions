/*
Problem: Maximum Triplet Product
Time Complexity: O(n * log n)
Space Complexity: O(1)
*/

class Solution {
    public int maxTripletProduct(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int maxPr1 = arr[0]*arr[1]*arr[n-1];
        int maxPr2 = arr[n-1]*arr[n-2]*arr[n-3];
        return Math.max(maxPr1,maxPr2);
        
    }
}
