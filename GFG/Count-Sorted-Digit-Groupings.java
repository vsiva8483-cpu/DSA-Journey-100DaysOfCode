class Solution {
    int[][] dp =new int[101][901];
    int solve(String s,int index,int prevSum){
        if(index==s.length()){
            return 1;
    }
    if(dp[index][prevSum]!=-1){
        return dp[index][prevSum];
    }
    int sum=0;
    int count=0;
    for(int i=index; i<s.length(); i++){
        sum=sum+s.charAt(i) - '0';
        if(sum>=prevSum){
            count=count+solve(s,i+1,sum);
        }
    }
    return dp[index][prevSum]=count;
    }
    public int validGroups(String s) {
        for(int i=0; i<101;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(s,0,0);
        
    }
}
