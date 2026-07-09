class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int cnt = 0;
        ans.put(0,1);
        for(int i =0; i < n; i++){
            sum = sum + nums[i];
            if(ans.containsKey(sum - k )){
                cnt = cnt + ans.get(sum -k);}
               
            if(ans.containsKey(sum)){
                ans.put(sum,ans.get(sum)+1);
                }
            else{
                ans.put(sum,1);
            }
        
        }
        return cnt;
    }
}