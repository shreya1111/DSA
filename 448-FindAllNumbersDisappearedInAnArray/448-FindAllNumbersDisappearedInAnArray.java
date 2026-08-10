// Last updated: 10/08/2026, 23:54:57
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if( nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
         List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
         if(nums[index]!=index+1){
        ans.add(index+1);
         }
        }
           
        return ans;
        
    }
     static void swap(int[] arr, int first , int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
  }
    }
