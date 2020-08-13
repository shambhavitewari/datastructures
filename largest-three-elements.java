public class Main {
    
     public static int[] threeLarge(int[] nums){
         
         int l = nums.length;
         int[] retArr= new int[3];
         
             for(int i=0; i<l;i++){
                 
              if(retArr[2]<nums[i])
              {
                  retArr[0]=retArr[1];
                  retArr[1]=retArr[2];
                  retArr[2] =nums[i];
              }
                 else if(retArr[1]<nums[i])
                 {
                    retArr[0]=retArr[1];
                    retArr[1]=nums[i];
                 }
                 else if(retArr[0]<nums[i])
                 {
                     retArr[0]=nums[i];
                 }
                 
                }
             
         Arrays.sort(retArr);
         for(int i=0; i<3;i++)
         {
             System.out.println(retArr[i]);
         }
         
         return retArr;
         
         
         
     }

    
    public static void main(String[] args) {
        int[] a = {5,9,10,12};
        threeLarge(a);
    }
}
