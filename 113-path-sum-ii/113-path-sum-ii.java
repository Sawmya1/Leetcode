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
    List<List<Integer>> answer;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        rootToLeavePath(root, targetSum, 0, list);
        return answer;
    }
    private void rootToLeavePath(TreeNode node, int target, int sum, List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.val);
        if(node.left == null && node.right == null){
            if(sum + node.val == target){
                answer.add(new ArrayList<>(list));
            }
            list.remove(list.size() - 1);
            return;
        }
        rootToLeavePath(node.left, target, sum + node.val, list);
        rootToLeavePath(node.right, target, sum + node.val, list);
        
        list.remove(list.size() - 1);
    }
}