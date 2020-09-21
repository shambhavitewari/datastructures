class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        
        int[] reArr = new int[T.length];
        
        for(int i =0; i<T.length;i++)
        {
            reArr[i]=0;
            for(int j=i+1;j<T.length;j++)
            {
            if(T[i]<T[j])
            {
                reArr[i]=j-i;
                break;
            }
            }
                
        }
        
        return reArr;
        
        
    }
}
