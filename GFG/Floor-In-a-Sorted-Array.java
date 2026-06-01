class Solution {
    public int findFloor(int[] arr, int x) {
        int ans=-1;
        // code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=x){
                ans= i;
            }
        }
        return ans;
    }
}
