public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> h = new HashSet<Integer>();
        
        for(Integer n:nums){
            
            if(h.contains(n)){
                return true;
            }
            
            h.add(n);
            
        }
        
      return false;  
    }
}