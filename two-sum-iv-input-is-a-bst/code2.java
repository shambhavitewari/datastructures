class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public boolean findTarget(TreeNode node, int k) {
        
       if(node == null) 
           return false;
        
        if(set.contains(k-node.val)) 
        {
            return true;
        }
        else
        {
            set.add(node.val);
        }
        return findTarget(node.left, k) || findTarget(node.right, k);
    }
