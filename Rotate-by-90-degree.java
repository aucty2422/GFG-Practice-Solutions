/*
Problem: Rotate by 90 degree (ACW)
Time Complexity: O(n*n)
Space Complexity: O(1)
*/

class Solution {
    public void rotateMatrix(int[][] arr) {
        
        //transpose of matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        //column reversal
        for(int j=0;j<arr[0].length;j++){
            int a =0;
            int b = arr.length-1;
            while(a<b){
                int temp = arr[a][j];
                arr[a][j]=arr[b][j];
                arr[b][j]=temp;
                a++;
                b--;
            }
        }
    }
}
