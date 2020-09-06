class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = candies[0];
        List<Boolean> rest = new ArrayList<Boolean>();
        
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max= candies[i];
            }
        }
        
        
        for(int i=0; i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                rest.add(true);
            else
                rest.add(false);
        }
        
        //System.out.println(max);
        
        return rest;
    }
}
