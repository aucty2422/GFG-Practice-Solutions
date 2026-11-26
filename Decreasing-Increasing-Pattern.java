/*
Problem: Decreasing Increasing Pattern
Time Complexity: O(n)
Space Complexity: O(n) 
*/

class Solution {
    public void before(int n,int sum, ArrayList<Integer> list){
        if(sum>n) return;
        list.add(sum);
        before(n,sum+5,list);
    }
    
    public void after(int n,int sum, ArrayList<Integer> list){
        if(sum<=0){
            before(n,sum,list);
            return;
        }
        list.add(sum);
        after(n,sum-5,list);
    }
    
    public ArrayList<Integer> pattern(int n) {
        //for negative numbers
        if(n<0) return new ArrayList<>(Arrays.asList(n));
        //for positive numbers
        ArrayList<Integer> list = new ArrayList<>();
        after(n,n,list);
        return list;
    }
}
