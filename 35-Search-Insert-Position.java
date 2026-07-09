class Solution {
    public int binarysearch(int[] nums, int high, int low, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int searchInsert(int[] nums, int target) {
        return binarysearch(nums, nums.length - 1, 0, target);
    }
}