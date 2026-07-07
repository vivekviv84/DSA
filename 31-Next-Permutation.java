class Solution {
    void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    void reverse(int[] nums, int x , int y){
        for(int i= x; i <= (y+x)/2;i++){
            swap(nums,i,y+x-i);
        }

    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i = n-1 ; i >=0 ; i--){
            if(nums[index] < nums[i]){
                swap(nums,index,i);
                break;
            }
        }

        reverse(nums, index+1, n-1);
    return;
    }

}
