/*
Problem: Median of 2 Sorted Arrays of Different Sizes
Time Complexity: O(m + n)
Space Complexity: O(m + n)
*/

class Solution {
    public double medianOf2(int a[], int b[]) {

        ArrayList<Integer> merge = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merge.add(a[i]);
                i++;
                
            }else if(a[i]==b[j]){
                merge.add(a[i]);
                i++;
            }else{
                merge.add(b[j]);
                j++;
            }
        }
        
        while(i<a.length){
            merge.add(a[i]);
            i++;
        }
        while(j<b.length){
            merge.add(b[j]);
            j++;
        }
        
        int mid = merge.size()/2;
        double val = 0;
        if(merge.size()%2==0){
            val =  ((double)merge.get(mid)+merge.get(mid-1))/2;
        }else val = merge.get(mid);

        return val;
        
    }
}
