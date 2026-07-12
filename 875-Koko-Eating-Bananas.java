class Solution {
    public long bananaperhour(int[] piles, int mid){
        long totalhour = 0;
        for(int i =0; i < piles.length; i++){
            totalhour += (piles[i] + mid - 1) / mid;
        }
        return totalhour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxi= 0;
        for(int i = 0; i<n; i++){
            maxi = Math.max(maxi,piles[i]);
        }
        int low = 1;
        int high = maxi;
        while(low <= high){
            int mid = (low+high)/2;
            if(bananaperhour(piles, mid) > h){
                low = mid + 1;
            }
            else{
                high =mid -1;
            }
        }
        return low;
    }
}