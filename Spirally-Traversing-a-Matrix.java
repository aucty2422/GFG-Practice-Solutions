/*
Problem: Spirally Traversing Matrix
Time Complexity: O(m*n)
Space Complexity: O(m*n)
*/

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        
        int fr = 0;
        int fc=0;
        int lr = arr.length-1;
        int lc = arr[0].length-1;
        int cnt = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++){
                ans.add(arr[fr][j]);
                cnt++;
            }
            fr++;
            if(cnt==arr.length*arr[0].length) break;
            for(int i=fr;i<=lr;i++){
                ans.add(arr[i][lc]);
                cnt++;
            }
            lc--;
            if(cnt==arr.length*arr[0].length) break;
            for(int j = lc;j>=fc;j--){
                ans.add(arr[lr][j]);
                cnt++;
            }
            lr--;
            if(cnt==arr.length*arr[0].length) break;
            for(int i=lr;i>=fr;i--){
                ans.add(arr[i][fc]);
                cnt++;
            }
            fc++;
            if(cnt==arr.length*arr[0].length) break;
        }
        return ans;
        
        
        
    }
}
