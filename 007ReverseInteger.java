class Solution {
   public int reverse(int input){
	  int flag=1;
      if(input<0) flag=-1;
      input*=flag;
      long result=0;
      while(input!=0){
          int number=input%10;
          input=input/10;
          result=result*10+number;
      if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
      }
      return (int)(result*flag);
   }
}