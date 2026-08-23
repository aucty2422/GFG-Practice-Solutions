/*
Problem: Longest subarray with Atmost two distinct integers
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int totalElements(int[] arr) {
        
        int maxLen=0;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<arr.length){
            int val = arr[j];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size()>2){
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0) map.remove(arr[i]);
                i++;
            }
            
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
        
    }
}
