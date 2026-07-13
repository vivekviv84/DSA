class Solution {
    public int divisor(int[] nums, int threshold, int mid){
        int ans =0;
        for(int i =0; i< nums.length; i++){
            ans += (nums[i] +mid -1)/ mid;
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int high = 0;
        int low = 1;

        for(int no: nums){
            high = Math.max(high,no);
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(divisor(nums,threshold, mid) <= threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }return low;
        
    }
}