public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int s1 = nums1.length;
        int s2 = nums2.length;
        int result[];
        if(s1 ==0 && s2 == 0)
            return nums1;
        
        if(s1 <= s2)
            result = findIntersection(nums1,nums2);
            
        else
            result = findIntersection(nums2,nums1);
            
        return result;
    }
    
    public int[] findIntersection(int [] nums1, int [] nums2){
        
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    results.add(nums1[i]);
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
                
            }
        }
        
        int size = results.size();
        int result[] = new int[size];
        int j = 0;
        for(int i:results){
            result[j] = i;
            j++;
        }
        
        return result;
        
    }
}