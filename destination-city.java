class Solution {
    public String destCity(List<List<String>> paths) {
       
        String dest= paths.get(0).get(1);
        
        if(paths.size()==1)
        {
            return paths.get(0).get(1);
        }
        
        else{
            
            
       // dest = paths.get(0).get(1);
        for(int i =0; i<paths.size(); i++)
        {
        
           for(int j =0; j<paths.size(); j++)
            {
               
               if(dest.equals(paths.get(j).get(0))==false)  
                   
                    {
                         continue;
                    }
                else
                    {
                        dest = paths.get(j).get(1);
                
                    }
           }
                
        }
          
                }
        
            return dest;
        
        
        }
        
    }
