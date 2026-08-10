// Last updated: 10/08/2026, 23:54:16

class Solution {
    public int[] sortedSquares(int[] nums) {
        
       int n = nums.length;
       int ar[]=new int[n];
       int i = 0;
       int j = n-1;
       int index = n-1;
       while(i<=j){
        int leftsqu=nums[i]*nums[i];
        int rightsqu=nums[j]*nums[j];

        if(leftsqu>rightsqu){
          ar[index]=leftsqu;
          i++;
        }
        else{
            ar[index]=rightsqu;
            j--;
        }
        index--;
       } 
       return ar;
    }
}