/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
*/
public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
        return nums[0];
        
        Map<Integer,Integer> m= new HashMap<Integer,Integer>();
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            count = 0;
            
            if(m.get(nums[i])!=null)
            count = m.get(nums[i]);
            
            else
            count = 0;
            
            
            m.put(nums[i],count+1);
        }
        
        for(int j=0;j<nums.length;j++){
            if(m.get(nums[j])==1){
                return nums[j];
            }
        }
        return 0;
    }
}