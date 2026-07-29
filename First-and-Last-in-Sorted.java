/*
Problem: First and Last in Sorted
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    ArrayList<Integer> find(int nums[], int target) {
        


        //first occurence
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high=mid-1;
                
            }else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }

        //last occurence
        int last =-1;
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
            }else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }

        
        return new ArrayList<>(Arrays.asList(first,last));
        
    }
}
