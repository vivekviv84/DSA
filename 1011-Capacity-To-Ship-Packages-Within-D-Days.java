class Solution {
    public int DAYS(int[] weights, int mid){
        int c = 1;
        int s = 0;
        for(int i =0; i< weights.length; i++){
            s = s + weights[i];
            if(s > mid){
                i--;
                s=0;
                c++;
            }
        }
        return c;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum =0;
        int low =0;  
        for(int weight:weights){
            sum = sum + weight;
            low = Math.max(low, weight);
        }
        int high = sum;
        while(low <= high){
            int mid =(low+high)/2;
            if(DAYS(weights,mid) > days){
                low = mid+1;
            }else{
                high= mid-1;
            }
        } return low;
        
    }
}