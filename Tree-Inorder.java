/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
//recursive

/*
void Inorder(Node root) {
    
    if(root==null) {
        return;
    }
    Inorder(root.left);
    System.out.print(root.data+" ");
    Inorder(root.right);
}
*/

//non-recursive
void Inorder(Node root){
    Stack<Node> S = new Stack<Node>();
    
    while(true){
        while(root != null){
            
            S.push(root);
            root = root.left;
        }    
            if(!S.empty()) {
                root = S.pop();
                System.out.print(root.data+" ");
            }
        
        else{
            break;
        }
           
            root = root.right;
            
        
    }    
}

