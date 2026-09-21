/*
Problem: Move all Negatives to End
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public void segregateElements(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0) ans.add(arr[i]); 
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) ans.add(arr[i]); 
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        
        
    }
}
