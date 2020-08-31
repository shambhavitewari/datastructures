class Solution {
    int sum =0;
    void printInorder(TreeNode root,int L, int R) 
    { 
        if (root == null) 
        {
            return; 
        }
  
        printInorder(root.left, L, R); 
  
        if(root.val<=R && root.val>=L){
            sum=sum+root.val;
        }
  
        printInorder(root.right,L,R); 
    } 
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        printInorder(root,L,R);
        return sum;
        
    }
}
