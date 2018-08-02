/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //Plan A:   
        //If we can change the val of node
        //When a pointer pass a node, keep a sign
        //First the pointer on headA sign -1
        //Second the pointer on headB sign 1       
        //Third headA move to tail, if find 1, the return the node
        
    //Plan B:
        if(headA==null || headB==null) return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=  a==null?headB:a.next;
            b=  b==null?headA:b.next;
        }        
        return a;
     }
}