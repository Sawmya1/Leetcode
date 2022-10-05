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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
                if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;
            root=node;
            return root;
        }
        else{
            //we will do Level Order Traversal here
            //Level Order is called BFS in graph
            //root node level will be 1 as per question
            //Initialize level variable with 1 
            //this variable will keep the track of levels
            int level=1;
            
            //make a Queue
            //In Java Queue is a Interface that can Implement PriorityQueue or LinkedList
            //I have considered LinkedList here
            Queue<TreeNode> q=new LinkedList<>();
            
            //Seeding or Initialization
            //add root value into the queue
            q.add(root);
            
            // till the queue is not empty we will keep on popping out the treenodes
            while(!q.isEmpty())
            {
                //Initialize the size of the queue
                int size=q.size();
                
                // this loop will give us nodes according to levels
                //eg for the first time it will run 1 time as we have just root in the queue
                //which means we are at level 1
                
                while(size>0)
                {
                    
                    // Basic Implementation of Level order Traversal
                    TreeNode removed=q.poll();
                    if(removed.left!=null)q.add(removed.left);
                    if(removed.right!=null)q.add(removed.right);
                    
                    
                    //The main question starts here
                    // checking if level -depth-1
                    if(level==depth-1){
                        
                        // making 2 dummy nodes with value val as per question
                        TreeNode leftnode=new TreeNode(val);
                        TreeNode rightnode=new TreeNode(val);
                        
                        //Storing the values of right and left nodes of our removedNode from the queue
                        TreeNode rightofRemoved=removed.right;
                        TreeNode leftofRemoved=removed.left;
                        
                        //now assign new left and right nodes to removed node
                        removed.left=leftnode;
                        removed.right=rightnode;
                        
                        //now assign the left stored node to the left dummy node
                         //now assign the right stored node to the right dummy node
                        leftnode.left=leftofRemoved;
                        rightnode.right=rightofRemoved;
                        
                        
                        
                    }
                    
                    size--;
                }
                
                // here checking if we are done with the level==depth-1 no need to proceed further hence break out
                if(level==depth-1)break;
                
//                 else increase the level
                level++;
                
                
                
                
            }
            
            return root;
            
            
           
            
        }
        
    }
}
 