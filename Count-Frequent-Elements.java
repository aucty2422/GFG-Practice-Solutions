/*
Problem: Count Frequent Elements
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int countOccurence(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int cnt=0;
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>arr.length/k) cnt++;
        }
        return cnt;
    }
}
