class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int diff = Integer.MAX_VALUE;
        int res=0;

        for(int i=0;i<n-2;i++){
           int left=i+1;
           int right=n-1;
           
        while(left<right){
            int total=nums[left]+nums[right]+nums[i];
            int d = Math.abs(target - total);

            if(d<diff){
                diff=d;
                res= total;
            }
            if(total==target){
                return res;
            }
            if(total<target){
               left++;
            }
            else{
                right--;
            }
           }
        }
        return res;
    }
}