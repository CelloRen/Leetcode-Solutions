class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] c=new int[nums1.length+nums2.length];
		
		c=combine(nums1,nums2);
		if(c.length%2==1) return (double)c[c.length/2]; 
		else return ((double)c[c.length/2-1]+(double)c[c.length/2])/2;
	}
	
	/**
	 * Combine two array sorted
	 */
	public static int[] combine(int[] a,int[] b){
		int[] c = new int[a.length+b.length];
		int indexA=0,indexB=0;
		int i=0;
		while(indexA<a.length && indexB<b.length){
			//c[i]=a[indexA]>b[indexB]?b[indexB++]:a[indexA++];
			if(a[indexA]>b[indexB]) c[i]=b[indexB++];
			else c[i]=a[indexA++];
			i++;
		}
		if(indexA==a.length)
			while(i<a.length+b.length&&indexB<b.length)
				c[i++]=b[indexB++];
		if(indexB==b.length)
			while(i<a.length+b.length&&indexA<a.length)
				c[i++]=a[indexA++];
			
		return c;
	}
}