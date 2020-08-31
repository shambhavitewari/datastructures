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
    
    void addInorder(TreeNode root) 
    { 
        if (root == null) 
        {
            return; 
        }
  
        addInorder(root.left); 
  
        //System.out.print(node.val); 
        ls.add(root.val);
        
        addInorder(root.right); 
    } 
    
    void updateInorder(TreeNode root) 
    { 
        if (root == null) 
        {
            return; 
        }
  
        updateInorder(root.left); 
  
        //System.out.print(node.val); 
        int sum=0;
        for(int i=0;i<ls.size();i++)
        {
            if(root.val<ls.get(i)){
                
                sum=sum+ls.get(i);
            }
        }
        root.val=root.val+sum;
  
        updateInorder(root.right); 
    } 
    public TreeNode convertBST(TreeNode root) {
        
        addInorder(root);
        updateInorder(root);
        return root;
        
        
    }
}
