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