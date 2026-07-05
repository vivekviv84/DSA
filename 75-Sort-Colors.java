class Solution {
    void swap(int[] nums,int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int mid = 0;
        int right = n-1;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums,left, mid);
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }
        }

    }
}