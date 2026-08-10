// Last updated: 10/08/2026, 23:54:02
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while(num > 0){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            steps++;
        }

        return steps;
    }
}