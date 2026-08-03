class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq=new HashMap<>();
        // Count the Magazine characters
        for(char ch : magazine.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        // Consume charcters for ransom note
        for(char ch : ransomNote.toCharArray()){
            if(!freq.containsKey(ch) || freq.get(ch)==0){
                return false;
            }
            freq.put(ch,freq.get(ch)-1);
        } 
        return true;
    }
}