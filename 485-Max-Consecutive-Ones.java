class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxcnt = 0;
        for(int n:nums){
            if( n == 1){
                cnt++;
                maxcnt = Math.max(maxcnt,cnt);
            }
            else{ 
                cnt = 0;
            }
        }
        return maxcnt;
    }
}