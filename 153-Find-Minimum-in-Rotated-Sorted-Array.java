class Solution {
    public int binarySearch(int[] nums, int low, int high){
        int smallest = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]<= nums[low] && nums[mid] <= nums[high] ){
                smallest = Math.min(smallest, nums[mid]);
            }
            if(nums[mid]> nums[high] && nums[low] > nums[high]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }return smallest; 
    }
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length-1);
    }
}