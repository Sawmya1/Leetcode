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
        Map<Integer, TreeMap<Integer,PriorityQueue<Integer>>> mp;
	
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        mp = new TreeMap<>();
        dfs(root,0,0);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> tm:mp.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq : tm.values())
                while(!pq.isEmpty()){
                    ans.get(ans.size()-1).add(pq.poll());
                }
        }
        
        return ans;
        
    }
    private void dfs(TreeNode root, int x, int y){
        if(root == null)
            return;
        if(!mp.containsKey(y))
            mp.put(y,new TreeMap<>());
        
        if(!mp.get(y).containsKey(x)){
            mp.get(y).put(x,new PriorityQueue<>());
        }
        
        mp.get(y).get(x).offer(root.val);
        
        dfs(root.left,x+1,y-1);
        dfs(root.right,x+1,y+1);
        
    }
}