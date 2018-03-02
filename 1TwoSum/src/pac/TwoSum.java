package pac;

import java.util.HashMap;
import java.util.Map;

/**
 * The first problem of leetCode----TwoSum
 * Using the hash to solve the problem,O(n) time
 * If using the bruce way,O(n^2) time
 * @author Cello.Ren
 *
 */
public class TwoSum {
	/**
	 * Test unit
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]= new int[4];
		a[0]=2;a[1]=3;a[2]=6;a[3]=8;
		int b[]= twoSum(a, 4);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}
	
	
	/**
	 * Hash to solve the problem
	 * @param a
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] a,int target){
		int length = a.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++){
			map.put(a[i], i);
		}
		
		for(int i=0;i<a.length;i++){
		int temp = target-a[i];
		if(map.containsKey(temp) && map.get(temp)!=i){
			int b[]= new int[2];
			b[0]=i;
			b[1]=map.get(temp);
			return b;
		}
		}
		return null;
	} 
}
