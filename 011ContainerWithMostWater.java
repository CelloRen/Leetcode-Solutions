class Solution {
    public int maxArea(int[] height) {
	     if(height.length<=1) return 0;
         //initialize
		 int maxWater=0;
		 int start=0,end=height.length-1;
	     //Find the MaxArea   
		 while(start<end){
	        	int width=end-start;
	        	int length;
	        	//because the water contained depends on the shortest edge
	        	//length=the shorter part,and the short edge move to center
	        	if(height[start]>height[end]){
	        		length=height[end];
	        		end--;
	        	}
	        	else{
	        		length=height[start];
	        		start++;
	        	}
	        	//if water >maxWater,exchange
	        	int water=width*length;
	        	if(water>maxWater)
	        		maxWater=water;
	        }
	        return maxWater;        		
	    }
}