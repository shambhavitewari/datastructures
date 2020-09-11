class Solution {
    public int maxProduct(int[] nums) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int curr =1;
            for(int j=i;j<nums.length;j++)
            {
              curr = curr*nums[j];
            if(max<=curr)
            {
                max=curr;
            }
            else
            {
                break;
            }  
            }
            
        }
        
        return max;
        
    }
}
