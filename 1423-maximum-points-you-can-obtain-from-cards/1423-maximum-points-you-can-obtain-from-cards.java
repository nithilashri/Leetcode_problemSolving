class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentScore = 0;
        
        // 1. Take the sum of the first k elements (all cards from the left)
        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }
        
        int maxScore = currentScore;
        
        // 2. Slide the window by swapping cards from the left with cards from the right
        for (int i = 0; i < k; i++) {
            currentScore -= cardPoints[k - 1 - i]; // Remove from left
            currentScore += cardPoints[n - 1 - i]; // Add from right
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}