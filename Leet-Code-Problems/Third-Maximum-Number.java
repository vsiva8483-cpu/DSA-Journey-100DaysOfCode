class Solution {
    public int thirdMax(int[] nums) {
        int maximum=nums[0];
        for(int i=0; i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
        }
        int second=0;
        boolean secondFound=false;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<maximum){
            if(!secondFound ||  nums[i]>second){
                second=nums[i];
                secondFound=true;
            }
        }
        }
        if(!secondFound){
            return maximum;
        }
        
        int third=0;
        boolean thirdfound=false;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<second){
            if( !thirdfound || nums[i] > third){
                third=nums[i];
                thirdfound=true;
            }
        }
        }
        if(!thirdfound){
            return maximum;
        }
        
            return third;
    
    }
}
