// Last updated: 10/08/2026, 23:55:27
class Solution {
    public int addDigits(int num) {

      if(num%9==0){
      return (num-1)%9 +1;
      }
      return num%9;
    }
}