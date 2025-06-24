public class ReservationBST{
    Node root; 
    
    public ReservationBST(){
        root = null; 
    }
    
    public void insert(int data) {
        root = insertNode(root, data); 
    }

    private Node insertNode(Node root, int data)
    {
        if (root == null)
        {
            root = new Node(data);
            return root;  
        }

       if (data < root.data) {
            root.left = insertNode(root.left, data);  
        } else if (data > root.data) {
            root.right = insertNode(root.right, data); 
    }
    return root; 

} 

    public void inorderdisplay() {
        inorder(root);  
    }

  private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);    
            System.out.print(root.data + " ");  
            inorder(root.right);   
        }
    }

  private boolean search(Node root, int data) {
        if (root == null) {
            return false;  
        }
        if (root.data == data) {
            return true;  
        }
        if (data < root.data) {
            return search(root.left, data);  
        } else {
            return search(root.right, data);  
        }
    }

    public boolean search(int data) {
        return search(root, data);  
    } 

}

