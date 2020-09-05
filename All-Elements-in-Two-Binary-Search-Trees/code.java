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
    
    List<Integer> ls = new ArrayList<Integer>();
    
    void printInorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        printInorder(node.left); 
        
        ls.add(node.val); 
  
        printInorder(node.right); 
   
    } 
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        printInorder(root1);
        printInorder(root2);
        Collections.sort(ls);
        
        return ls;
        
        
    }
}
