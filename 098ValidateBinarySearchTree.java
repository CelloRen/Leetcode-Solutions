/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        //We all know that for any node x, x.left.val < x.val < x.right 
        //So we can use inorder traversal to get the result
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            if(prev!=null && cur.val<=prev.val) return false;
            prev=cur;
            cur=cur.right;
        }
        return true;
    }
}