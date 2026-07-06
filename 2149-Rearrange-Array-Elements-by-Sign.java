class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int j =0;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else{
                negative.add(nums[i]);
            } 
        }
        for(int i = 0; i<n/2; i++){
            nums[j] = positive.get(i);
            j++;
            nums[j] = negative.get(i);
            j++;
        }
        return nums;
    }
}