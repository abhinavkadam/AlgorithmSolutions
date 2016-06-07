// power of 3

public class Solution {
    public boolean isPowerOfThree(int n) {
        
       
       
      if ( (Math.log10(n) / Math.log10(3) )%1==0)
      return true;
      
      return false;
       
       
       
       
       
       /*bruteforce -- start 
       
       while(n!=1){
           if(n%3==0)
           n = n / 3;
           
           else
           return false;
       }
       
       return true;
       
       
       bruteforce end  */
       
        
        
      
        
    }
}