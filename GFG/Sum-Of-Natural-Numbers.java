class Solution {
    static int sumOfNaturals(int n) {
        int sum=0;
        while(n>0){
            sum=sum+n;
            n--;
        }
        return sum;
    }
}
