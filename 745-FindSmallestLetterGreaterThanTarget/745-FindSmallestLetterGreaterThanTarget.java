// Last updated: 10/08/2026, 23:54:43
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int first=0;
        int end=letters.length-1;
        while(first<=end){
            int mid=first+(end-first)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else {
                first=mid+1;
            }
            
        }
return letters[first % letters.length];
    }

}