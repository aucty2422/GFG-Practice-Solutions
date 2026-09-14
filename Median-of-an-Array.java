/*
Problem: Median of an Array
Time Complexity: O(n * log n)
Space Complexity: O(1)
*/

class Solution {
    public double findMedian(int[] arr) {
        
        Arrays.sort(arr);
        int mid = arr.length/2;
        double val = 0;
        if(arr.length%2==0){
            val = ((double) arr[mid]+arr[mid-1])/2.0;
        }else{
            val = arr[mid]; 
        }
        
        return val;        
        
    }
}
