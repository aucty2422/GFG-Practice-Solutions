/*
Problem: Sum of Natural Numbers
Time Complexity: O(n)
Space Complexity: O(n)

Note: This is not the optimal approach, but it is implemented recursively for recursion practice.
*/


import java.util.Scanner;

class GFG {
    public static int total(int n){
        
        if(n==0){
            return 0;
        }
        return n+total(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(total(n));
        
    }
}
