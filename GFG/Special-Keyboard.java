class Solution {
    public int optimalKeys(int n) {
        // code here
        int[] dp=new int [n+1];
        for(int i=1; i<=n;i++){
            dp[i]=i;
            for(int j=1; j<=i-3; j++){
                dp[i]=Math.max(dp[i],dp[j] * (i-j-1));
            }
        }
        return dp[n];
    }
}
