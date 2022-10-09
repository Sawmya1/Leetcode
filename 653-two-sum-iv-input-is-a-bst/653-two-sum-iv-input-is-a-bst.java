class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root.left==null&&root.right==null)
            return false;
        List<Integer> values = new ArrayList<>();
        traverseTree(root, values);
        int i = 0, j = values.size()-1;
        while(i<j){
            int sum = values.get(i)+values.get(j);
            if(sum==k){
                return true;
            }
            if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    
    private void traverseTree(TreeNode node, List<Integer> values){
        if(node.left!=null)
            traverseTree(node.left, values);
        values.add(node.val);
        if(node.right!=null)
            traverseTree(node.right, values); 
    }
}