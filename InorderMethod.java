class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
public class InorderMethod
{ 
    // Root of Binary Tree 
    Node root; 
  
    InorderMethod() 
    { 
        root = null; 
    } 
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 

    void printInorder()   
     {     
         printInorder(root);  
     }

     public static void main(String[] args) 
    { 
      InorderMethod tree = new InorderMethod(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
       
    } 
} 
