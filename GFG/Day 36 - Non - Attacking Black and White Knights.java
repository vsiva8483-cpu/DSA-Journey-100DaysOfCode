class Solution {
    public int numOfWays(int n, int m) {
        // code here
        long totalSquares=1L*n*m;
        long totalWays=totalSquares*(totalSquares-1);
        long attackingWays=4L*(1L * (n-1) * (m-2) + 1L *(n-2) * (m-1));
        return (int)(totalWays-attackingWays);
        
    }
};
