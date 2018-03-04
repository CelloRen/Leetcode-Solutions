class Solution {
    public int[] twoSum(int[] nums, int target) {
                int length = nums.length;
		Map<Integer,Integer> map = new HashMap<>();//<value,the index of the value in nums>
		//Put all the nodes to the map
                for(int i=0;i<nums.length;i++){
			map.put(nums[i], i);
		}
		
                //Scan the nums,find the indices
		for(int i=0;i<nums.length;i++){
		int temp = target-nums[i];
		if(map.containsKey(temp) && map.get(temp)!=i){//If we find the indices, and the two indices are not the same 
            
			int result[]= new int[2];
			result[0]=i;
			result[1]=map.get(temp);
			return result;
		}
		}
		return null;
    }
}

//The worst case: we need to scan two times,first scan we need to put all to map,second scan we look for the two indices
//So the time complexity is O(n), space complexity is O(n). n is the length of array nums
