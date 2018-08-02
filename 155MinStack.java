class MinStack {

    private Node head;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(head==null)
            head=new Node(x,x);      
        else
            head=new Node(x,x<head.min?x:head.min,head);
        
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    private class Node{
        int val;
        int min;
        Node next;
        
        //Initialize the first
        Node(int val,int min){
            this.val=val;
            this.min=min;
            this.next=null;
        }
        
        //Initialize the with next
        Node(int val,int min,Node next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}

