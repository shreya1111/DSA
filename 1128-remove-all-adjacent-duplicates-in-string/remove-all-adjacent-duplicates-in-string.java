class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch:s.toCharArray()){
            if((!stack.isEmpty()) && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());

        }

        return ans.reverse().toString();
    }
}