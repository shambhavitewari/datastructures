class Solution {
    public String restoreString(String s, int[] indices) {
        
        String ret ="";
       //String ch = Character.toString(s.charAt(indices[2]));
        
        int[] arrN = new int[(indices.length)];
        
        for(int i=0; i<indices.length; i++)
        {
            for(int j = 0; j<indices.length; j++)
            {
                if(indices[j]==i)
                {
                    arrN[i]=indices[j];
                    
                    //char ch = s.charAt(j);
                    String c =Character.toString(s.charAt(j));
                    ret = ret.concat(c);
                }
            }
        }
         return ret;
        
    }
}
