class Solution {
    public int binarySearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                 return mid;
            }
            
            if(nums[low]<= nums[mid]){
                if(nums[low] <= target && nums[mid] > target){
                    high = mid - 1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(nums[high] >= target && nums[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid  - 1;
                }
            }
        } return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1,target);
    }
}