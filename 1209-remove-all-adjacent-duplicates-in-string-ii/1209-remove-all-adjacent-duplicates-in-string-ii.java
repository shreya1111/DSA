class Solution {
    class Pair{
        char ch;
        int c;
        Pair(char ch,int c){
            this.ch=ch;
            this.c=c;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair> Stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            // Same character at top
            if((!Stack.isEmpty()) && (Stack.peek().ch == ch)){
                Stack.peek().c++;
                if(Stack.peek().c == k){
                    Stack.pop();
                }
            }
            else{
                Stack.push(new Pair(ch,1));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!Stack.isEmpty()){
            Pair p=Stack.pop();

            for(int i=0;i<p.c;i++){
                result.append(p.ch);
            }
        }
        return result.reverse().toString();
    }
}