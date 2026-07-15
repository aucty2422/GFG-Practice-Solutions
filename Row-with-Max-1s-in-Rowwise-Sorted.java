/* 
Problem: Row with Max 1s in Rowwise Sorted
Time Complexity: O(n*n)
Space Complexity: O(1)
*/


class Solution {
    public int rowWithMax1s(int[][] arr) {
        
        int maxi = 0;
        int row = -1;
        for(int i = 0;i<arr.length;i++){
            int max1 = 0;
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]==1) max1++;
            }
            if(maxi<max1){
                    maxi = max1;
                    row = i;
                }
            
        }
        return row;
    
        
    }
};
