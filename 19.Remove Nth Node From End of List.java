/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
           if(n<1) return null;//Make sure the n is valid
		   ListNode dummy=new ListNode(0);
	       dummy.next= head;
	       ListNode first=dummy;
	       ListNode second=dummy;
	       //Move the first node to tail until the distance between first and second nodes is n
	       for(int i=0;i<=n;i++){
	    	   //Make sure n less than the number of the nodes of head
	    	   if(first==null) return null;
	    	   first=first.next;
	       }
	       //Move the two nodes until the first is null
	       //Then second.next node is the node we need to remove
	       while(first!=null){
	    	   first=first.next;
	    	   second=second.next;
	       }
	       //Remove the second.next node
	       second.next=second.next.next;
	       return dummy.next;//Why we choose to use dummy?
                             //Because if the deleted node is head, in other word n==length of list,we can't solve it without dummy
    }
}

//Time complexity:O(n) n is the length of list
//Actually it's O(n+m), m is the length of list, n is the problem said n-th node. If n is vaild n<=m, so it's less than O(2n)
//So it can be expressed as O(n)