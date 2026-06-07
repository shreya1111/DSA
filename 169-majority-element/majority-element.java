class Solution {
    
      
public int majorityElement(int[] nums) {
    int i=nums[0];
    int c=0;

    for(int num:nums){
        if(c==0){
            i=num;
        }
        if(num==i){
            c=c+1; 
        }
        else{
            c--;
        }

    }
    return i;
    
}
}