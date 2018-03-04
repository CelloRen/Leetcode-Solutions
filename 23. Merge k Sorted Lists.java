/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
         /**
	  * Merge k lists,using divide and conquer
	  */
	 public ListNode mergeKLists(ListNode[] lists) {
	 if(lists.length==0) return null;//Avoid the null input
		   
         //Divide and conquer to solve the problem 
           int interval=1;
	       while(interval<lists.length){
	    	   //merge
               for(int i=0;i<lists.length-interval;i+=2*interval)
	    		   lists[i]=mergeTwoLists(lists[i], lists[i+interval]);
	    	   
               interval*=2;
	       }
	       return lists[0];
	    }
	 
	 /**
	  * Merge two list
	  */
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         //Check the null situation
		    if(l1==null) return l2;
	        if(l2==null) return l1;
	        
	        ListNode keep=new ListNode(0);
	        ListNode head=keep;
	        //merge part one
	        while(l1!=null && l2!=null){
	        	head.next = l1.val<l2.val?l1:l2;
	        	head = head.next;
	        	ListNode temp=l1.val<l2.val?(l1=l1.next):(l2=l2.next);
	        }
	        //merge part two
	        if(l1==null) head.next=l2;
	        else head.next=l1;
	        
	        return keep.next; 
  }
}

//Time complexity : O(Nlog k) where k is the number of linked lists.