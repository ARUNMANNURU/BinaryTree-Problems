/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SizeOfTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* creating a binary tree and entering the nodes */
		SizeOfTree tree = new SizeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The size of binary tree is : "
                            + tree.size());
	}
	 static Node root;
	 
	    /* Given a binary tree. Print its nodes in level order
	       using array for implementing queue */
	    static int size()
	    {
	        return size(root);
	    }
	 
	    /* computes number of nodes in tree */
	    static int size(Node node)
	    {
	        if (node == null)
	            return 0;
	        else
	            return(size(node.left) + 1 + size(node.right));
	    }
}	
