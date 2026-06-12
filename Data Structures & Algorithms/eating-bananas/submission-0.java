class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        
        int left = 1;           
        int right = maxPile; 
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canEatAll(piles, mid, h)) {
                right = mid;   
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private boolean canEatAll(int[] piles, int k, int h) {
        long hours = 0; 
        
        for (int pile : piles) {
            hours += (pile + k - 1) / k; 
            if (hours > h) { 
                return false;
            }
        }
        return hours <= h;
    }
}
