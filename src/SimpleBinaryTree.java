/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */



public class SimpleBinaryTree {

	/**
	 * @param args
	 */
	
	 // Root of Binary Tree
    static Node root;
    static Node left,right;
 
    // Constructors
    SimpleBinaryTree(int key)
    {
        root = new Node(key);
    }
 
    SimpleBinaryTree()
    {
        root = null;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    SimpleBinaryTree tree = new SimpleBinaryTree();
		 
        /*create root*/
        tree.root = new Node(1);
 
        /* following is the tree after above statement
 
              1
            /   \
          null  null     */
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */
 
 
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
       pritnTree(root);
	}
	public static void pritnTree(Node root){
		Node n = root;
		Node l = left, r = right;
		while(n != null){
			System.out.println(n.key);
			n = n.left;
		}
	}

}
