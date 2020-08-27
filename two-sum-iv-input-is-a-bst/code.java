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
    
    List<Integer> arrList = new ArrayList<Integer>();
    
    void printInorder(TreeNode node) 
    { 
        if (node == null) 
        {
            return; 
        }
  
        printInorder(node.left); 
  
        //System.out.print(node.val);
        arrList.add(node.val);
  
        printInorder(node.right); 
    } 
    
    
    public boolean findTarget(TreeNode root, int k) {
        
        printInorder(root);
        for(int i=0; i<arrList.size()-1; i++)
        {
            for(int j=i+1; j<arrList.size();j++)
            {
            if(arrList.get(i)+arrList.get(j)==k)
                return true;
            }
        }
        
        return false;
        
    }
}
