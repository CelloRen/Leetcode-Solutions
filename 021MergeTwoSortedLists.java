/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
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