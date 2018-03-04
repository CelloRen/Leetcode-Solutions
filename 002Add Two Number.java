/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Check special case
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode head=new ListNode(0);//Store the result 
        ListNode dummy=head;
        int carry=0;//carry judgment
        while(l1!=null || l2!=null || carry!=0){     
        	int sum = ((l1==null)?0:l1.val)+((l2==null)?0:l2.val)+carry;
        	//Also you can use % and / operation like sum%10 and sum/10, but it's slower
            if(sum>=10){
                head.next=new ListNode(sum-10);
                carry=1;
            }
            else{
                head.next=new ListNode(sum);
                carry=0;
            }
            
        	head=head.next;
        	if(l1!=null) l1=l1.next;
        	if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}

//Time complexity is O(n). n is the max len of l1 and l2.
//Space complexity is O(n+m). n and m are the length of l1 and l2.
