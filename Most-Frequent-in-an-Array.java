/*
Problem: Most Frequent in an Array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int mostFreqEle(int[] arr) {
        
       //Optimal-Approach
       
       //hashmap to store array elements and their freq count
       HashMap<Integer,Integer> freq = new HashMap<>();
       int maxCnt = 0;
       //store freq count and find maxCnt
       for(int i=0;i<arr.length;i++){
           freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
           maxCnt = Math.max(maxCnt,freq.get(arr[i]));
       }
       
       //traverse the hashmap and find the max occuring element
       int ele = Integer.MIN_VALUE;
       for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
           if(entry.getValue()==maxCnt){
               ele = Math.max(ele,entry.getKey());
           }
       }
        return ele;
    }
}
