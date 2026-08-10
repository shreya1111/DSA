// Last updated: 10/08/2026, 23:55:13
class Solution {
    public void reverseString(char[] s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s){
            stack.push(ch);
        }
        for(int i=0; i<s.length; i++){
            s[i]=stack.pop();
        }
    }
}