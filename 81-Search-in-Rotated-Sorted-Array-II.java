class Solution {
    public boolean binarysearch(int[] nums, int low, int high,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
            low++;
            high--;
            continue;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low]<= target && nums[mid]> target){
                    high =mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[high] >= target && nums[mid]< target){
                    low =mid+1;
                }
                else{
                    high =mid-1;
                }
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length-1,target);
    }
}