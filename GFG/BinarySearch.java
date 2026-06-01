class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
}
