// Last updated: 10/08/2026, 23:55:10
class Solution {
    public boolean isPerfectSquare(int num) {
        
        long start=1;
        long end=num;
        while(start<=end){
            long mid = start + (end - start) / 2;

            long sqrt=mid*mid;
            if(sqrt==num){
                return true;
            }
            else if(sqrt>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}