class Solution {
    public int longestConsecutive(int[] nums) {  
        HashSet<Integer> exist = new HashSet<>();
        int n = nums.length;
        int length = 1;
        int maxlen = 0;
        if (n == 0){
            return 0;
        }
        for(int i=0 ; i< n; i++){
            exist.add(nums[i]);
        }

        for(int num:exist){
            if(!exist.contains(num-1)){
                int current = num;
                while(exist.contains(current+1)){
                length++;
                current++;
                }
            }
            maxlen = Math.max(length,maxlen);
        }
        return maxlen;   
    }
}