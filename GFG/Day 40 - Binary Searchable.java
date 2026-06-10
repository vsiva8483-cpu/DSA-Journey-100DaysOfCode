class Solution {
    public int binarySearchable(int[] arr) {
        int n=arr.length;
        int count=0;
        // code here
        for(int i=0;i<arr.length; i++){
        boolean found=false;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==arr[i]){
                found=true;
                break;
            }else if(arr[mid]<arr[i]){
                l=mid+1;
            }
        else{
            r=mid-1;
        }
    }
    if(found){
        count++;
    }
        }
        return count;
    }
}
