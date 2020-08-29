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
    
    
    Set<Integer> st = new HashSet<Integer>();
    void printInorder(TreeNode node) 
    { 
        if (node == null) 
        {
            return; 
        }
  
        printInorder(node.left); 
  
        st.add(node.val);
  
        printInorder(node.right); 
    } 
    public boolean isUnivalTree(TreeNode root) {
        
        printInorder(root);
        
        if(st.size()==1)
            return true;
        
        else
            return false;
       
        
        
        
    }
}
