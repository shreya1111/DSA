// Last updated: 10/08/2026, 23:54:52
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        // Count Characters in s
        for(char ch: s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd =false;

        // Traverse all Frequencies
        for(int count:freq.values()){

            if(count%2==0){
                length+=count;
            }
            else{
                // taking the largest even part of the odd count
                length+=count-1;
                odd=true;
            }
        }

        if(odd){
            length++;
        }
       return length;
    }
}