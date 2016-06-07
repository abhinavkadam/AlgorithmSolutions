public class Solution {
    public int majorityElement(int[] nums) {
        
      if(nums.length==0){
          return nums[0];          
      }   
	  
      java.util.Arrays.sort(nums);
      return nums[nums.length/2];
    }
}