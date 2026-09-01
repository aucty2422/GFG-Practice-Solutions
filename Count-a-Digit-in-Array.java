/*
Problem: Count a Digit in Array
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int countDigitK(int k, int arr[]) {
        
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            while(num>0){
                int rem = num%10;
                if(rem==k) cnt++;
                num/=10;
            }
        }
        return cnt;
        
    }
}
