class Solution {

    public int binarysearch(int[] nums, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length - 1, target);
    }
}