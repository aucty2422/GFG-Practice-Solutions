/*
Problem: Print n to 1 without loop
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
    void printNos(int n) {
        
        print(n);
        
    }
}
