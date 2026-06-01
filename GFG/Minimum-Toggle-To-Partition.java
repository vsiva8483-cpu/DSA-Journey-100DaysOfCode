class Solution {
    int minToggle(int[] arr) {
        int zerosRight = 0;

        // Count total zeros
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zerosRight++;
            }
        }

        int onesLeft = 0;
        int ans = zerosRight;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 1) {
                onesLeft++;
            } else {
                zerosRight--;
            }

            ans = Math.min(ans, onesLeft + zerosRight);
        }

        return ans;
    }
}

