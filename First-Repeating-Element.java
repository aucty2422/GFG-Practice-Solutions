/*
Problem: First Repeating Element
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int firstRepeated(int[] arr) {
        
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                ans = entry.getKey();
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans) {
                return i+1;
            }
        }
        
        return ans;
    }
}
