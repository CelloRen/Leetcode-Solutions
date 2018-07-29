class Solution {
    public boolean isPalindrome(int input) {
        if(input%10==0 && input!=0)
			return false;
		int revertedNumber=0;
		
		
		while(input>revertedNumber){
			revertedNumber=input%10+revertedNumber*10;
			input=input/10;
		}
		
		//when the input number is odd number,judge whether input==revertedNumber/10
		return input==revertedNumber || input==revertedNumber/10;
    }
}