class Solution {
    public int addDigits(int num) {

      if(num%9==0){
      return (num-1)%9 +1;
      }
      return num%9;
    }
}