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
    public void preHelper(TreeNode root, List<Integer> pre) {
		if(root==null) return;
		pre.add(root.val);
		preHelper(root.left,pre);
		preHelper(root.right,pre);
	}
    
    public List<Integer> preorderTraversal(TreeNode root) {
 //       	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> pre = new LinkedList<Integer>();
		preHelper(root,pre);
		return pre;
	
	    // List<Integer> pre = new ArrayList<Integer>();
        // if(root == null)
        //     return pre;
        // pre.add(root.val);
        // pre.addAll(preorderTraversal(root.left));
        // pre.addAll(preorderTraversal(root.right));
        // return pre;
    }
}