
class Solution {
    public boolean isAnagram(String s, String t) {
        int i = 0;
        if(s.length()!=(t.length())){
            return false;
           
        }

        while (i < s.length()) {
            char ch = s.charAt(i);

            int index=t.indexOf(ch);
            if(index==-1){
                return false;
            }
            t=t.substring(0,index)+t.substring(index+1);
            i++;
        }

        return true;
    }
}

