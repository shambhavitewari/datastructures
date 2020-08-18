 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val= x;    
    }
}


class Main{
    
    TreeNode root = null;
    
    void printPostorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        printPostorder(node.left); 
  
        printPostorder(node.right); 
   
        System.out.print(node.val); 
    } 
    
    void printInorder(TreeNode node) 
    { 
        if (node == null) 
        {
            return; 
        }
  
        printInorder(node.left); 
  
        System.out.print(node.val); 
  
        printInorder(node.right); 
    } 
    void printPreorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        System.out.print(node.val); 
  
        printPreorder(node.left); 
  
        printPreorder(node.right); 
    } 
    
    void printPostorder()  {     printPostorder(root); } 
    void printInorder()    {     printInorder(root);   } 
    void printPreorder()   {     printPreorder(root);  } 
    
    public static void main(String[] args) 
    { 
        Main tree = new Main(); 
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
  
        System.out.println("Preorder traversal "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal "); 
        tree.printPostorder(); 
    } 
}
