/*
Problem: Subset Sums
Time Complexity: O(2^n)
Space Complexity: O(2^n)
*/

class Solution {
    public void subsets(int sum, int[] arr, int idx, ArrayList<Integer> list){
        if(idx==arr.length){
            list.add(sum);
            return;
        }
        int val = arr[idx];
        subsets(sum+val,arr,idx+1,list);
        subsets(sum,arr,idx+1,list);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        subsets(0,arr,0,list);
        return list;
        
    }
}
