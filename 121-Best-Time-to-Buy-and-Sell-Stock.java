class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int j = 0;
        int max= 0;
        for(int i = 0; i<n; i++){
            int target = prices[i] - prices[j];
            if(target > 0){
                max = Math.max(max,target); 
            }
            if(target < 0){
                j = i;
            }
        }
        return max;        
    }
}