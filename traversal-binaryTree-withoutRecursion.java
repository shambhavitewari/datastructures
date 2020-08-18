class TreeNode{
    int val;
    TreeNode right = null;
    TreeNode left = null;
    TreeNode(int x)
    {
        val = x;
    }
}

class Main{
    
        TreeNode root;
        void inorder()
        {
            if (root == null)
            {
                return;
            }
            
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = root;
        
        while(curr!=null || s.size()>0)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
                curr= s.pop();
                System.out.println(curr.val);
                curr= curr.right;
        }
        
    }
    
     void preorder()
     {
         if(root==null)
             return;
         
         Stack<TreeNode> s = new Stack<TreeNode>();
         s.push(root);
         while(s.empty()== false)
         {
             TreeNode curr = s.peek();
             System.out.println(curr.val);
             s.pop();
             
             if(curr.right!=null)
                 s.push(curr.right);
             
             if(curr.left!=null)
                 s.push(curr.left);
         }
     }
    
    void postorder()
    {
        if(root==null)
        {
            return;
        }
        
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        s1.push(root);
        
        while(s1.empty()==false)
        {
            TreeNode temp = s1.pop();
            s2.push(temp);
            
            if(temp.left!=null)
            {
                s1.push(temp.left);
            }
            
            if(temp.right!=null)
            {
                s2.push(temp.right);
            }
        }
        
        while(s2.empty()==false)
        {
            TreeNode temp = s2.pop();
            System.out.println(temp.val);
        }
    }
    
    public static void main(String args[]) 
    { 
  
        
        Main tree = new Main(); 
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        System.out.println("inorder =");
        tree.inorder(); 
        System.out.println("preorder =");
        tree.preorder();
        System.out.println("postorder =");
        tree.postorder();
    } 
    
}
