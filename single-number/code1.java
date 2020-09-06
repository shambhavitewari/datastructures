class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
       
        for(int i =0; i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
            
        }
        
        //System.out.println(hm.get(nums[2]));
        
      for(int i=0;i<nums.length;i++)
      {
          if(hm.get(nums[i])==1)
          {
              return nums[i];
          }
      }
        return 0;
  }
}
