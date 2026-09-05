/*
Problem: Triplets Where One is Sum of Other Two
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int countTriplet(int arr[]) {
        
        Arrays.sort(arr);
        int cnt=0;
        HashSet<List<Integer>> set = new HashSet<>();
        for(int l=arr.length-1;l>=0;l--){
            int i=0;
            int j=l-1;
            int target = arr[l];
            List<Integer> triplet = new ArrayList<>();
            while(i<j){
                int sum = arr[i]+arr[j];
                if(sum<target) i++;
                else if(sum>target) j--;
                else{
                    triplet = new ArrayList<>(Arrays.asList(target,arr[i],arr[j]));
                    if(!set.contains(triplet)){
                        set.add(triplet);
                        cnt++;
                    }
                    i++;
                    j--;
                }
            }
        }
        return cnt;
        
    }
}
