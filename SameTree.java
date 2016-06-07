/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    //non recursive 
    /*
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null)
            return true;
            
        if(p==null || q==null)
            return false;
        
        StringBuffer p1 = preorder(p);
        StringBuffer p2 = preorder(q);
        
        String s1 = new String(p1);
        String s2 = new String(p2);
        
        return s1.equals(s2);
    }
    
    private StringBuffer preorder(TreeNode root){
        
        if(root==null)
            return null;
            
        StringBuffer s1 = new StringBuffer();
        Stack<TreeNode> S = new Stack<TreeNode>();
        while(true){
            while(root!=null){
                s1.append(root.val);
                if(root.left==null)
                    s1.append("x");
                    
                
                
                S.push(root);
                
                root = root.left;
                
            
            }
           
            
            if(!S.isEmpty())
            {
                root = S.pop();
                if(root.right==null)
                    s1.append("x");
                    
                root = root.right;
            }
            else 
            break;
    }
    return s1;
}

*/
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
     if(p==null && q==null)
        return true;
        
      if(p==null || q==null || p.val!=q.val){
          return false;
      }
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
    

}