/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag=true;
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(prev!=null && root.val<=prev.val){
            flag=false;
            return;
        }
        prev=root;
        
        inorder(root.right);        
    }
}