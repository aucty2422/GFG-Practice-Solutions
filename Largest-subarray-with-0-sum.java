/*
Problem: Largest subarray with 0 sum
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    int maxLength(int arr[]) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (sum==0) length=i+1;
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                length = Math.max(len,length);
            }
            map.putIfAbsent(sum,i);
        }
        return length;
        
    }
}
