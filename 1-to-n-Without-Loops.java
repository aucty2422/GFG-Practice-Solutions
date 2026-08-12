/*
Problem: 1 to n Without Loops
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void print(int x,int n){
        if(x>n) return;
        System.out.print(x+" ");
        print(x+1,n);
        
    }
    public void printTillN(int n) {
        
        print(1,n);
        
    }
}
