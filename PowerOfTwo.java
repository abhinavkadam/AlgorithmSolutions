//find out if the number is power of two 


public class Solution {
    public boolean isPowerOfTwo(int n) {
     
     if(n==1)
     return true;
     
     if(n<1)
     return false;
     
     while(n!=1){
         if(n%2==0){
             n = n/2;
         }
         
         else
         return false;
     }
     return true;
    }
}