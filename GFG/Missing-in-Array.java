class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long totalsum=(long)n*(n+1)/2;
        long actualsum=0;
        for(int i=0; i<arr.length;i++){
            actualsum+=arr[i];
        }
        return(int) (totalsum-actualsum);
    }
}
