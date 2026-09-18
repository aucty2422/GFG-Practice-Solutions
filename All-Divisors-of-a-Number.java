/*
Problem: All Divisors of a Number
Time Complexity: O(√n + k log k), k is the number of divisors
Space Complexity: O(k)
*/

class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans.add(i);
                if(i!=n/i) ans.add(n/i);
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}
