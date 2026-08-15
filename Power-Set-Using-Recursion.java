/*
Problem: Power Set Using Recursion
Time Complexity: O(n * 2^n)
Space Complexity: O(n * 2^n)
*/

class Solution {
     public void set(String ans, String s, int idx, ArrayList<String> list){
         
         if(idx==s.length()){
                 list.add(ans);
                 return;
         }
         char ch = s.charAt(idx);
         set(ans+ch,s,idx+1,list);
         set(ans,s,idx+1,list);
         
     }
    public ArrayList<String> powerSet(String s) {
       
        ArrayList<String> list = new ArrayList<>();
        set("",s,0,list);
        return list;
    }
}

