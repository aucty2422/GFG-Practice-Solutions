/*
Problem: Common in 3 Sorted Arrays
Time Complexity: O(m+n+o)
Spacee Complexity: O(min(n, m) + min(n, m, p))
*/


class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        
        
       // Compute intersection of arrays a and b
        int i=0;
        int j=0;
        // Stores unique common elements of a and b
        ArrayList<Integer> two = new ArrayList<>();
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;
            else{
                if(two.isEmpty()|| two.get(two.size()-1)!=a[i]) two.add(a[i]);
                i++;
                j++;
            }
        }
        
        //Intersection  of array list two and array c
        i=0;
        j=0;
        //Stores unique common elements of two and c
        ArrayList<Integer> three = new ArrayList<>();
        
        while(i<two.size()&&j<c.length){
            if(two.get(i)<c[j]) i++;
            else if(two.get(i)>c[j]) j++;
            else{
                if(three.isEmpty()||three.get(three.size()-1)!=two.get(i)) three.add(two.get(i));
                i++;
                j++;
            }
        }
        return three;
    }
}
